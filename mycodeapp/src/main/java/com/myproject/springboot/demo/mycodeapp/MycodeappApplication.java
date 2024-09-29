package com.myproject.springboot.demo.mycodeapp;

import com.myproject.springboot.demo.dao.StudentDAO;
import com.myproject.springboot.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.myproject.springboot.demo.mycodeapp",
											"com.myproject.springboot.demo.dao"})
@EntityScan(basePackages = {"com.myproject.springboot.demo.entity"})
public class MycodeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycodeappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("creating the student object...");
		Student student = new Student("Manas", "patra", "patramanas817@gmail.com");

		// save the student object
		System.out.println("saving the student object");
		studentDAO.save(student);

		// display the id of the student object
		System.out.println("displaying the id of the student object.." + student.getId());
		System.out.println("first Name:  " + student.getFirstName());

	}

}
