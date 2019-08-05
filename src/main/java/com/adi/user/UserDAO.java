package com.adi.user;

import org.springframework.orm.hibernate3.HibernateTemplate;
import java.util.List;

public interface UserDAO {
    void setTemplate(HibernateTemplate template);
    void saveuser(User e);
    void updateuser(User e);
    void deleteuser(User e);
    User getById(int id);
    void displayNameAll();
    List<User> getuser();
}
