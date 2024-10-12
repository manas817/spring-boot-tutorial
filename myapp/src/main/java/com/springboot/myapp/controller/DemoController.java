package com.springboot.myapp.controller;

import com.springboot.myapp.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/form")
public class DemoController {

    @Value("${countries}")
    List<String> Mycountries;

    @Value("${languages}")
    List<String> Mylanguages;

    @Value("${systems}")
    List<String> OperatingSys;

    @GetMapping("showform")
    public String showForm(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("allCountries", Mycountries);
        theModel.addAttribute("allLanguages", Mylanguages);
        theModel.addAttribute("allOS",OperatingSys);
        return "inputform";
    }

    @PostMapping("processform")
    public String confirmationPage(@ModelAttribute("student") Student theStudent){
        return "outputform";
    }

}
