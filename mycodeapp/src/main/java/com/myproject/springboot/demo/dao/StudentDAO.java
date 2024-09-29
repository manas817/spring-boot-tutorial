package com.myproject.springboot.demo.dao;

import com.myproject.springboot.demo.entity.Student;

public interface StudentDAO {
    public void save(Student theStudent);
    public Student findById(Integer id);
}
