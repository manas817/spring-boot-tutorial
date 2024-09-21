package com.myproject.springboot.demo.mycodeapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // injecting properties for: coach name and team name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamDetails(){
        return "COACH NAME: " + coachName + " TEAM NAME: " + teamName;
    }

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
