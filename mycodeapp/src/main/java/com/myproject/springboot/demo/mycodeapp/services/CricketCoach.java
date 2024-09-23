package com.myproject.springboot.demo.mycodeapp.services;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Batting daily for 30 minutes...";
    }
}
