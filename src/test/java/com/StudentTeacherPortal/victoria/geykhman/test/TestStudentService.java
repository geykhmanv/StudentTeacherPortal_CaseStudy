package com.StudentTeacherPortal.victoria.geykhman.test;



import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.StudentTeacherPortal.victoria.geykhman.model.Student;
import com.StudentTeacherPortal.victoria.geykhman.service.StudentServiceInterface;

@SpringBootTest
class TestStudentService {

	@Autowired 
	StudentServiceInterface studentService;

	//StudentService Tests
	public void whenFindByName_thenReturnStudent() {
		List<Student> foundStudents = studentService.findStudentByLastName("Brown");
		Assertions.assertTrue(!foundStudents.isEmpty());
	}
	
	@Test
	public void whenFindByStudentId_thenReturnStudent() {
		List<Student> foundStudents = studentService.findStudentById((long) 1);
		Assertions.assertTrue(!foundStudents.isEmpty());
	}
	
	@Test
	public void whenGetAllStudents_thenReturnStudents() {
		List<Student> foundStudents = studentService.getAllStudents();
		Assertions.assertTrue(!foundStudents.isEmpty());
	}
	
	

}//class TestStudentService 
