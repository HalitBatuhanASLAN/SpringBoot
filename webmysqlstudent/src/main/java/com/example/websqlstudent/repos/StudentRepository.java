package com.example.websqlstudent.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.websqlstudent.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
