package com.springboot.myapp.controller;

import com.springboot.myapp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    private List<Student> students;

    // define post construct to load the student data .... only once!
    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();

        students.add(new Student("Manas", "Patra"));
        students.add(new Student("sainikhil", "Pati"));
        students.add(new Student("Varad", "Pai"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentbyId(@PathVariable int studentId){
        return students.get(studentId);
    }
}
