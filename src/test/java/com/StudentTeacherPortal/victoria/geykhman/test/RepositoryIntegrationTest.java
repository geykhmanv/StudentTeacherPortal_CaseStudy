package com.StudentTeacherPortal.victoria.geykhman.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.repository.TeacherRepository;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherServiceInterface;

//@DataJpaTest
@SpringBootTest
public class RepositoryIntegrationTest {
	
	@Autowired
	private TeacherServiceInterface teacherService;
	
	//@Autowired
	private TeacherRepository teacherRepo;
		
	@Test
	public void whenFindByName_thenReturnTeacher() {	   
	    List<Teacher> foundTeachers = teacherService.findTeacherByLastName("Smith");
	    Assertions.assertTrue(!foundTeachers.isEmpty());  
	}//public void whenFindByName_thenReturnTeacher

}//public class RepositoryIntegrationTest 
