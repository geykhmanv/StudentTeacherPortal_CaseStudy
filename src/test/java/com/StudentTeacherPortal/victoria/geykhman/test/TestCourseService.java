package com.StudentTeacherPortal.victoria.geykhman.test;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;
import com.StudentTeacherPortal.victoria.geykhman.service.CourseServiceInterface;

@SpringBootTest
class TestCourseService {

	@Autowired
	private CourseServiceInterface courseService;

	//CourseService Tests
	@Test
	public void whenFindByCourseName_thenReturnCourse() {
		List<Course> foundCourses = courseService.findCourseByName("Linear Algebra");
		Assertions.assertTrue(!foundCourses.isEmpty());
	}
	
	@Test
	public void whenFindByCourseId_thenReturnCourse() {
		List<Course> foundCourses = courseService.findCourseById((long) 4);
		Assertions.assertTrue(!foundCourses.isEmpty());
	}
	
	@Test
	public void whenGetAllCourses_thenReturnCourses() {
		List<Course> foundCourses = courseService.getAllCourses();
		Assertions.assertTrue(!foundCourses.isEmpty());
	}

}//class TestCourseService
