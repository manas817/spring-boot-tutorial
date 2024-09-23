package com.myproject.springboot.demo.mycodeapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice baseball today for 2 hours..";
    }
}
