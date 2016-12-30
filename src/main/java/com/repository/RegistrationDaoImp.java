package com.repository;

import com.model.Registration;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by saif23 on 11/21/2016.
 */
@Repository
public class RegistrationDaoImp implements RegistrationDao {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public void add(Registration registration) {
        sessionFactory.getCurrentSession().save(registration);
    }

    @Override
    public Registration getUser(String username) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Registration.class)
                .add(Restrictions.eq("username", username));
        Registration registration = (Registration) criteria.uniqueResult();
        return registration;
    }

    @Override
    public List getAllStudent() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Registration.class)
                .addOrder(Order.asc("ID"));
        return criteria.list();
    }
}
