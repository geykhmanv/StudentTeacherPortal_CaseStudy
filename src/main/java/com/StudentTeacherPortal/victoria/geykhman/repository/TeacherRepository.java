package com.StudentTeacherPortal.victoria.geykhman.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Long>{
	List<Teacher> findByEmail(String email);
	List<Teacher> findByLastName(String lastName);
	
	
}
