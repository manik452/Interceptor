package com.repository;

import com.model.Registration;


import java.util.List;

/**
 * Created by saif23 on 11/21/2016.
 */
public interface RegistrationDao {
    public void add(Registration registration);
    public Registration getUser(String username);
    public List getAllStudent();
}
