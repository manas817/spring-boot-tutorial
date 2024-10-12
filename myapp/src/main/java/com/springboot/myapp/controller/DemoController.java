package com.springboot.myapp.controller;

import com.springboot.myapp.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/form")
public class DemoController {

    @GetMapping("showform")
    public String showForm(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        return "inputform";
    }

    @PostMapping("processform")
    public String confirmationPage(@ModelAttribute("student") Student theStudent){
        return "outputform";
    }

}
