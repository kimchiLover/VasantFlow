package com.adi.dept;

import javax.persistence.*;

@Entity
@Table(name="dept")
@NamedQuery(name = "Dept.getDeptIdByDeptName" , query = "Select d.dept_id FROM dept d WHERE searchName = d.dept_name")
public class Dept
{
    @Id
    @Column(name="dept_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dept_id;
    @Column(name="dept_name")
    private String dept_name;

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Dept(String dept_name) {
        this.dept_name = dept_name;
    }
}
