package com.adi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {

   // @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(){}

    Resource r=new ClassPathResource("applicationContext.xml");
    ApplicationContext factory= new ClassPathXmlApplicationContext("applicationContext.xml");

    UserDAOImpl dao=(UserDAOImpl) factory.getBean("d");

    @Override
    @Transactional
    public User findUser( String email) {
        List<User> ls=new ArrayList<User>();
        ls=dao.getuser();
        User u= new User();
        Iterator<User> it= ls.iterator();
        while(it.hasNext()) {
            if(email.equals(it.next().getEmail())) {
                return it.next();
            }
        }
        User dummy=new User("","");
        return dummy;
    }

    @Override
    @Transactional
    public boolean findUserExistence(String email) {
        List<User> ls=new ArrayList<User>();
        ls=dao.getuser();
        User u= new User();
        Iterator<User> it= ls.iterator();
        while(it.hasNext()) {
            if(email.equals(it.next().getEmail())) {
                return true;
            }
        }
        return false;
    }

    @Override
    @Transactional
    public int insertUser(String name, String email) {
        User e=new User(name, email);
        dao.saveuser(e);
        return Integer.parseInt(userRepository.getUidByNameByEmail(name,email));
    }

    @Override
    @Transactional
    public void RemoveUser(User u) {
        dao.deleteuser(u);
    }
}
