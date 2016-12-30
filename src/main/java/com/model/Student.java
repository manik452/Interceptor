package com.model;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Created by saif23 on 11/8/2016.
 */
@Entity
@Table(name = "mvctable")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private  String firstname;

    @Column
    private String lastname;

    public void Student(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setLastname(String lastnaem) {
        this.lastname = lastnaem;
    }
}
