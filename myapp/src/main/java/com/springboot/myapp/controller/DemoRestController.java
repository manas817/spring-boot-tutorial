package com.springboot.myapp.controller;

import com.springboot.myapp.entity.Student;
import com.springboot.myapp.entity.StudentErrorResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        if (studentId >= students.size() || studentId < 0){
            throw new StudentNotFoundException("Student id not found " + studentId);
        }
        return students.get(studentId);
    }


}
