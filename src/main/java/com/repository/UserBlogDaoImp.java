package com.repository;

import com.model.Registration;
import com.model.UserBlog;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by saif23 on 11/21/2016.
 */
@Repository
public class UserBlogDaoImp implements UserBlogDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBlog(UserBlog userBlog) {
        sessionFactory.getCurrentSession().save(userBlog);
    }

    @Override
    public List getPost(long userid) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserBlog.class)
                .add(Restrictions.eq("user_id", userid));
        return criteria.list();
    }

    @Override
    public List getAllBlog() {

        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(UserBlog.class);
        return criteria.list();
    }
}
