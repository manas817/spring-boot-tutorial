package com.myproject.springboot.demo.mycodeapp.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    // init method
    @PostConstruct
    public void doSomeStartupStuff(){
        System.out.println("In doSomeStartupStuff: " + getClass().getSimpleName());
    }

    // destroy method
    @PreDestroy
    public void doSomeCleanupStuff(){
        System.out.println("In doSomeCleanupStuff: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Batting daily for 30 minutes...";
    }
}
