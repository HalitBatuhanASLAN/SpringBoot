package com.example.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springdatajpa.entities.Student;
import com.example.springdatajpa.repos.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository repository;
	
	@Test
	void testSaveStudent()
	{
		Student student = new Student();
		student.setId(1l);
		student.setName("HBA");
		student.setTestScore(06);
		repository.save(student);

	
		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
	}
	
	
	@Test
	void testDeleteStudent()
	{
		Student savedStudent = repository.findById(1l).get();
		
		repository.deleteById(savedStudent.getId());
	
		assertNotNull(savedStudent);
	}
	
	
	@Test
	void testUpdateStudent()
	{
		Student savedStudent = repository.findById(1l).get();

		savedStudent.setId(1l);
		savedStudent.setName("HBA06");
		savedStudent.setTestScore(06);
		repository.save(savedStudent);
	
		assertNotNull(savedStudent);
	}
}
