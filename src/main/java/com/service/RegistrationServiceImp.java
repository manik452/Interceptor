package com.service;

import com.model.Registration;
import com.repository.RegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by saif23 on 11/21/2016.
 */
@Service
@Transactional
public class RegistrationServiceImp implements RegistrationService {

    @Autowired
    private RegistrationDao registrationDao;

    @Override
    public void add(Registration registration) {
        registrationDao.add(registration);
    }

    @Override
    public Registration getUser(String username) {
        return registrationDao.getUser(username);
    }

    @Override
    public List getAllStudent() {
        return registrationDao.getAllStudent();

    }
}
