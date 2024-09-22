package com.myproject.springboot.demo.mycodeapp.controller;

import com.myproject.springboot.demo.mycodeapp.services.Coach;
import org.springframework.beans.factory.annotation.Autowired;
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

    private Coach mycoach;

    @Autowired
    public void setCoach(Coach theCoach){
        mycoach = theCoach;
    }

    @GetMapping("/teaminfo")
    public String getTeamDetails(){
        return "COACH NAME: " + coachName + " TEAM NAME: " + teamName;
    }

    // expose '/' that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String workout() {
        return mycoach.getDailyWorkout();
    }


}
