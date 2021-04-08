package com.StudentTeacherPortal.victoria.geykhman.test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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
	
	@Test 
	public void whenFindById_thenReturnTeacher() {
		List<Teacher> foundTeachers = teacherService.findTeacherById(Long.valueOf(1));
		Assertions.assertTrue(!foundTeachers.isEmpty());
	}
	
	@Test 
	public void whenGetAllTeachers_thenReturnTeachers() {
		List<Teacher> foundTeachers = teacherService.getAllTeachers();
		Assertions.assertTrue(!foundTeachers.isEmpty());
	}

	
	@Test
	public void teacherCRUD_Test() {
		long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
		
        //Add teacher
        Teacher expectedTeacher = new Teacher("robert1", "robert1", "Robert", "Jones", "robert@yahoo.com", "888-888-8888", "66 Fork Road", "Smalltown", "VA", "98745", "Teacher", date);
		Teacher actualTeacher = teacherService.addTeacher(expectedTeacher);
		assertEquals(expectedTeacher, actualTeacher);
		
		//Update teacher
		actualTeacher.setLastName("Briggs");
		actualTeacher = teacherService.updateTeacher(actualTeacher);
		assertEquals(actualTeacher, actualTeacher);
		
		/*Delete teacher
		long id = actualTeacher.getId();
		teacherService.deleteTeacher(actualTeacher.getId());
		Teacher deletedTeacher = teacherService.findOneTeacherById(id);		
		assertNull(deletedTeacher);*/
	}
	
}//class TestTeacherService 
