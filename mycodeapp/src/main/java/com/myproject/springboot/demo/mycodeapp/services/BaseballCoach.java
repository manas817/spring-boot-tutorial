package com.myproject.springboot.demo.mycodeapp.services;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice baseball today for 2 hours..";
    }
}
