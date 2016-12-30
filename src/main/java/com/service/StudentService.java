package com.service;

import com.model.Student;

import java.util.List;

/**
 * Created by saif23 on 11/8/2016.
 */
public interface StudentService {
    public void add(Student student);
    public void edit(Student student);
    public void delete(int studentId);
    public Student getStudent(int studentID);
    public List getAllStudent();
}
