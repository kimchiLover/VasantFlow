package com.adi.user;

import javax.persistence.*;

@Entity
@Table(name="user")
@NamedQuery( name="User.getUidByNameByEmail", query="select u.id from User u where u.name=searchName and u.email=searchEmail")

public class User
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public User(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    public User() {
    }
}