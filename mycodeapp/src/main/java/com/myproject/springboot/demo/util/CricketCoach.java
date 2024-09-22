package com.myproject.springboot.demo.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice Batting daily for 30 minutes.";
    }
}
