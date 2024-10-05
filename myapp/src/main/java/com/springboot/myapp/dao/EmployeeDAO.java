package com.springboot.myapp.dao;

import com.springboot.myapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
