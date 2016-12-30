package com.model;

import javax.persistence.*;

/**
 * Created by saif23 on 11/21/2016.
 */
@Entity
@Table(name = "USER_INFORMATION")
public class Registration {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String username;

    @Column
    private String userpassword;



    public Registration() {
    }

    public int getID() {
        return ID;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}
