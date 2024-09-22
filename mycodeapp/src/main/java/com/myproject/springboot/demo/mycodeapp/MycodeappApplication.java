package com.myproject.springboot.demo.mycodeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.myproject.springboot.demo.mycodeapp",
											"com.myproject.springboot.demo.util"})
public class MycodeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycodeappApplication.class, args);
	}

}
