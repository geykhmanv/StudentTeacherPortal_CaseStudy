package com.StudentTeacherPortal.victoria.geykhman.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherServiceInterface;

@SpringBootTest
class TestTeacherService {
	
	@Autowired
	private TeacherServiceInterface teacherService;

	//TeacherService Tests
	@Test
	public void whenFindByName_thenReturnTeacher() {	   
	    List<Teacher> foundTeachers = teacherService.findTeacherByLastName("Smith");
	    Assertions.assertTrue(!foundTeachers.isEmpty());  
	}
	
	@Test public void whenFindById_thenReturnTeacher() {
		List<Teacher> foundTeachers = teacherService.findTeacherById((long) 1);
		Assertions.assertTrue(!foundTeachers.isEmpty());
	}
	
	@Test public void whenGetAllTeachers_thenReturnTeachers() {
		List<Teacher> foundTeachers = teacherService.getAllTeachers();
		Assertions.assertTrue(!foundTeachers.isEmpty());
	}

	//test add, delete, update, remove
	
	
}//class TestTeacherService 
