package com.springboot.myapp.controllers;

import com.springboot.myapp.entity.Employee;
import com.springboot.myapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){
        List<Employee> theEmployees = employeeService.findAll();
        System.out.println(theEmployees);
        theModel.addAttribute("employees", theEmployees);
        return "list-employees";
    }
}
