package com.adi.interest;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class InterestDAOImpl implements InterestDAO {

    HibernateTemplate template;
    /*private static SessionFactory sfactory;

    public static void setSfactory(SessionFactory sfactory) {
        InterestDAOImpl.sfactory = sfactory;
    }*/

    @Override
    public void addInterest(int u_id, int dept_id) {

    }

    @Override
    public void removeInterest(int u_id, int dept_id) {

    }

    @Override
    public void showInterest(int u_id) {

    }

    @Override
    public void setTemplate(HibernateTemplate template) {
    }
}