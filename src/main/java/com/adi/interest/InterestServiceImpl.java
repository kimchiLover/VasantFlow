package com.adi.interest;

import com.adi.user.UserDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InterestServiceImpl implements InterestService {

    Resource r=new ClassPathResource("applicationContext.xml");
    ApplicationContext factory2= new ClassPathXmlApplicationContext("applicationContext.xml");
    InterestDAOImpl dao=(InterestDAOImpl) factory2.getBean("e");

    @Override
    @Transactional
    public void addInterest(int u_id, int dept_id) {

    }

    @Override
    @Transactional
    public void removeInterest(int u_id, int dept_id) {

    }

    @Override
    @Transactional
    public void showInterest(int u_id) {

    }
}