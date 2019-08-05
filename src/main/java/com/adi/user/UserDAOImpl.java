package com.adi.user;

import org.hibernate.*;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    HibernateTemplate template;

    private UserRepository repository;
    //private static SessionFactory sfactory;

    public UserDAOImpl(){}

   /* public static void setSfactory(SessionFactory sfactory) {
        UserDAOImpl.sfactory = sfactory;
    }*/

    /*@Override
    public List<User> searchByName(String searchName) {
        return null;
    }*/

    @Override
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }

    @Override
    public void saveuser(User e){
        template.save(e);
    }

    @Override
    public void updateuser(User e){
        template.update(e);
    }

    @Override
    public void deleteuser(User e) {
        template.delete(e);
    }

    @Override
    public User getById(int id) {
        User e=(User) template.get(User.class, id);
        return e;
    }

    @Override
    public void displayNameAll() {
     // List <User> = repository.displayName();
    }

    @Override
    public List<User> getuser(){
        List<User> list=new ArrayList<User>();
        return template.loadAll(User.class);
    }
}