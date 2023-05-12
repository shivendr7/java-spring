package com.bharath.student.dal.studentdal;

import com.bharath.student.dal.entities.Student;
import com.bharath.student.dal.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository repo;

	@Test
	void contextLoads() {
		// CREATE
		Student student = new Student();
		student.setName("John");
		student.setCourse("Serverless with AWS lambda");
		student.setFee(30d);
		repo.save(student);
	}

	@Test
	void testFindStudentById() {
		// READ 
		Student student = repo.findById(1l).get();
		System.out.println(student);
	}

	@Test
	void testUpdateStudent() {
		// UPDATE
		Student student = repo.findById(1l).get();
		student.setFee(40d);
		repo.save(student);
	}

	@Test
	void testDeleteStudent() {
		// DELETE
		Student student = repo.findById(1l).get();
		repo.delete(student);
	}


}
