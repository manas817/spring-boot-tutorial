package com.springboot.myapp.controller;

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
    @GetMapping("/processform")
    public String processform() {
        return "helloworld";
    }
}
