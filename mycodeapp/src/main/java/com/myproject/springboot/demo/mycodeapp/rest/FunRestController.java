package com.myproject.springboot.demo.mycodeapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose '/' that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // adding a new endpoint to test dev tools (auto-reload)
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "today run gor 10km.";
    }
}
