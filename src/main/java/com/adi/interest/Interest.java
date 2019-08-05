package com.adi.interest;

import javax.persistence.*;

@Entity
@Table(name="interest")
public class Interest {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="u_id")
    private int u_id;
    @Column(name="dept_id")
    private int dept_id;
    @Column(name="flag")
    private boolean flag;

    public Interest(int u_id, int dept_id) {
        this.u_id = u_id;
        this.dept_id = dept_id;
        this.flag = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}