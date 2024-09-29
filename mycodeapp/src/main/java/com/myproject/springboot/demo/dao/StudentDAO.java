package com.myproject.springboot.demo.dao;

import com.myproject.springboot.demo.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student theStudent);
    public Student findById(Integer id);
    public List<Student> findAll();
    public List<Student> findByLastName(String thelastName);
    public void update(Student theStudent);
}
