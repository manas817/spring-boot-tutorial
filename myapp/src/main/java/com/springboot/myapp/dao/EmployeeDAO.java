package com.springboot.myapp.dao;

import com.springboot.myapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
    public Employee findById(int id);
    public Employee save(Employee theEmployee);
    public void deleteById(int theId);
}
