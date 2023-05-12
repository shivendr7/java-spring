package com.bharath.student.dal.studentdal;

import com.bharath.student.dal.entities.Student;
import com.bharath.student.dal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentdalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdalApplication.class, args);
	}

}
