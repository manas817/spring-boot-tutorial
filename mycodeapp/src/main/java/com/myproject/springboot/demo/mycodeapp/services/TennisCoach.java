package com.myproject.springboot.demo.mycodeapp.services;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice tennis today for 1 hours...";
    }
}
