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
			 // createInstructor(appDAO);
			// findInstructor(appDAO);
			// deleteInstructor(appDAO);
			//findInstructorDetail(appDAO);
			deleteInstructorDetail(appDAO);

		};
	}

	private void deleteInstructorDetail(AppDAO appDAO) {
		int theId = 4;
		appDAO.deleteInstructorDetailById(theId);
		System.out.println("Completed Delete InstructorDetail!");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		int theId = 3;
		System.out.println("finding InstructorDetail id: " + theId);
		InstructorDetail theInstructorDetail = appDAO.findInstructorDetailById(theId);
		System.out.println("printing instructorDetail: " + theInstructorDetail);
		System.out.println("printing associated Instructor: " + theInstructorDetail.getInstructor());
	}

	private void deleteInstructor(AppDAO appDAO) {
		int theId = 2;
		System.out.println("Deleting instructor id: " + theId);
		appDAO.deleteByInstructorId(theId);
		System.out.println("Done!");
	}

	private void findInstructor(AppDAO appDAO) {

		int theId = 1;
		System.out.println("Finding instructor id: " + theId);

		Instructor theInstructor = appDAO.findInstructorById(theId);
		System.out.println("the instructor is " + theInstructor);
		System.out.println("the associated instructorDetail only: " + theInstructor.getInstructorDetail());

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
