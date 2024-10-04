package com.springboot.myapp.controller;

import com.springboot.myapp.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Manas", "Patra"));
        students.add(new Student("Nishit", "Hingu"));
        students.add(new Student("Gaurang", "Raje"));

        return students;
    }
}
