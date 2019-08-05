package com.adi.interest;

import org.springframework.orm.hibernate3.HibernateTemplate;

public interface InterestDAO {
    void addInterest(int u_id,int dept_id);
    void removeInterest(int u_id,int dept_id);
    void showInterest(int u_id);
    void setTemplate(HibernateTemplate template);
}
