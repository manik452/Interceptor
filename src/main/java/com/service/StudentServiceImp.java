package com.service;

import com.model.Student;
import com.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by saif23 on 11/8/2016.
 */
@Service
@Transactional
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;
    public void add(Student student) {
            studentDao.add(student);
    }
    public void edit(Student student) {
            studentDao.edit(student);
    }
    public void delete(int studentId) {
        studentDao.delete(studentId);

    }

    public Student getStudent(int studentID) {
        return studentDao.getStudent(studentID);
    }
    public List getAllStudent() {
        return studentDao.getAllStudent();
    }

}
