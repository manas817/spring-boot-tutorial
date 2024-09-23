package com.myproject.springboot.demo.mycodeapp.Config;

import com.myproject.springboot.demo.mycodeapp.services.Coach;
import com.myproject.springboot.demo.mycodeapp.services.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
