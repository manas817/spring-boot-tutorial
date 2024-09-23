package com.myproject.springboot.demo.mycodeapp.services;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Get ready to swim in olympics 2028.";
    }
}
