package com.repository;

import com.model.Student;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by saif23 on 11/8/2016.
 */
@Repository
public class StudentDaoImp implements StudentDao{

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory session;

    @Override
    public void add(Student student) {
        session.getCurrentSession().save(student);

    }
    @Override
    public void edit(Student student) {

        session.getCurrentSession().update(student);
    }
    @Override
    public void delete(int studentId) {

        session.getCurrentSession().delete(studentId);
    }
    @Override
    public Student getStudent(int studentID) {
        return  (Student) session.getCurrentSession().get(Student.class,studentID);

    }
    @Override
    public List getAllStudent() {
        Criteria criteria = session.getCurrentSession().createCriteria(Student.class)
                .addOrder(Order.asc("id"));
        return criteria.list();
    }
}
