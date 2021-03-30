package com.StudentTeacherPortal.victoria.geykhman.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentTeacherPortal.victoria.geykhman.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByLastName(String lastName);

}
