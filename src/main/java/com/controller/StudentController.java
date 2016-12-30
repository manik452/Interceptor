package com.controller;

import com.model.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by saif23 on 11/8/2016.
 */
@Controller
public class StudentController {

    /**
     *
     */
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/user/index")
    public String setupForm(Map<String, Object> map) {

        Student student = new Student();
        map.put("student", student);
        map.put("studentList", studentService.getAllStudent());

        List<Student> st = new ArrayList<Student>();
        st=studentService.getAllStudent();

        for (Student std :   st) {
            System.out.println(std.getFirstname());

        }


        return "student";
    }

    @RequestMapping(value = "/user/student.do", method = RequestMethod.POST)
    public String doAction(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object> map) {
        Student studentResult = new Student();
        String s = action.toLowerCase();
        if (s.equals("add")) {
            studentService.add(student);
            studentResult = student;

        } else if (s.equals("edit")) {
            studentService.edit(student);
            studentResult = student;

        } else if (s.equals("delete")) {
            studentService.delete(student.getId());
            studentResult = new Student();

        } else if (s.equals("search")) {
            Student searchStudent = studentService.getStudent(student.getId());
            studentResult = searchStudent != null ? searchStudent : new Student();
        }
        map.put("student", studentResult);
        map.put("studentList", studentService.getAllStudent());


        return "student";
    }

}
