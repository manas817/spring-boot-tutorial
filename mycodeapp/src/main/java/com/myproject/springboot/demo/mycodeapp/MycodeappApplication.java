package com.myproject.springboot.demo.mycodeapp;

import com.myproject.springboot.demo.dao.StudentDAO;
import com.myproject.springboot.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
			// readStudents(studentDAO);
			// queryForStudents(studentDAO);
			// queryStudentsByLastName(studentDAO);
			// updateStudent(studentDAO);
			//deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleting the student ID: " + studentId);
		studentDAO.delete(studentId);

	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primary key
		int studentId=2;
		System.out.println("Getting student with id: " + studentId);

		Student theStudent = studentDAO.findById(studentId);
		System.out.println("Updating student...");

		// changing the first name to "Peter"
		theStudent.setFirstName("Peter");
		studentDAO.update(theStudent);

		System.out.println("Updated Student: " + theStudent);
	}

	private void queryStudentsByLastName(StudentDAO studentDAO) {
		// get list for students by last name
		List<Student> studentsList = studentDAO.findByLastName("Brooks");

		// Display the student list
		for(Student s : studentsList){
			System.out.println(s);
		}

	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get list of students
		List<Student> studentsList = studentDAO.findAll();

		// display list of students
		for(Student s : studentsList){
			System.out.println(s);
		}

	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		Student mystudent = new Student("Harry", "Brooks", "h.brooks@yahoo.com");

		// save the student object
		studentDAO.save(mystudent);

		//display the id of the saved student
		int theId = mystudent.getId();
		System.out.println("the student id is: " + theId);

		//retrieve the student based on primary key: id
		Student thestudent = studentDAO.findById(theId);

		// Display the retrieved student
		System.out.println("Displaying the read student: " + thestudent);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("creating the student object...");
		Student student = new Student("Manas", "patra", "patramanas817@gmail.com");
		Student student1 = new Student("Alice", "parker", "a.parker@hotmail.com");
		Student student2 = new Student("Peter", "hanks", "h.peter@yahoo.com");

		// save the student object
		System.out.println("saving the student object");
		studentDAO.save(student);
		studentDAO.save(student1);
		studentDAO.save(student2);

		// display the id of the student object
		System.out.println("displaying the id of the student object.." + student.getId());
		System.out.println("first Name:  " + student.getFirstName());

	}

}
