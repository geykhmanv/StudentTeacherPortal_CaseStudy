package com.StudentTeacherPortal.victoria.geykhman.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;



public interface CourseRepository extends JpaRepository<Course, Long>{
	
}