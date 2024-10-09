package com.springboot.myapp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DemoController {

    @GetMapping("/showform")
    public String showform() {
        return "htmlform";
    }
    @GetMapping("/processformv2")
    public String processform(HttpServletRequest request, Model theModel) {
        // read the request parameter from the html form
        String name = request.getParameter("studentName");
        // convert the name to uppercase
        String result = "Yo! " + name.toUpperCase();
        // save the message in model
        theModel.addAttribute("message", result);
        return "helloworld";
    }
}
