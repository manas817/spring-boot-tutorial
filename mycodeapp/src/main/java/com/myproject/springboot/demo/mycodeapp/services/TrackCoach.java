package com.myproject.springboot.demo.mycodeapp.services;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice sprinting today for few minutes...";
    }
}
