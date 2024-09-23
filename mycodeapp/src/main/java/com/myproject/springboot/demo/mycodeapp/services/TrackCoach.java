package com.myproject.springboot.demo.mycodeapp.services;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice sprinting today for few minutes...";
    }
}
