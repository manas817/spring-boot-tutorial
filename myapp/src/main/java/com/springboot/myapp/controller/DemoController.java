package com.springboot.myapp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DemoController {

    @GetMapping("/showform")
    public String showform() {
        return "htmlform";
    }
    @PostMapping("/processformv3")
    public String processformv3(@RequestParam("studentName") String theName, Model theModel) {

        // convert the name to uppercase
        String result = "Hey my friend " + theName.toUpperCase();
        // save the message in model
        theModel.addAttribute("message", result);
        return "helloworld";
    }
}
