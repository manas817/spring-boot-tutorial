package com.springboot.myapp.dao;

import com.springboot.myapp.entity.Instructor;
import com.springboot.myapp.entity.InstructorDetail;

public interface AppDAO {

    public void save(Instructor instructor);
    Instructor findInstructorById(int id);
}
