package com.springboot.myapp;

import com.springboot.myapp.dao.AppDAO;
import com.springboot.myapp.entity.Instructor;
import com.springboot.myapp.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
		
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {
		// create instructor object
		Instructor theinstructor = new Instructor("Manas", "patra", "patramanas817@gamil.com");

		// create instructor details object
		InstructorDetail theinstructorDetail = new InstructorDetail("mychannel@youtube.in", "cooking");

		// associate instructor details
		theinstructor.setInstructorDetail(theinstructorDetail);

		System.out.println("Saving....." + theinstructor);
		// save the instructor object
		appDAO.save(theinstructor);

		System.out.println("Done!");




	}

}
