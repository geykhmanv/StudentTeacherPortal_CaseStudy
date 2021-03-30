package com.StudentTeacherPortal.victoria.geykhman.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByCourseName(String courseName);
	
}