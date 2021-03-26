package com.StudentTeacherPortal.victoria.geykhman.test;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.repository.TeacherRepository;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherService;

//@DataJpaTest
public class RepositoryIntegrationTest {
	
	//@Autowired
	private TeacherService teacherService;
	
	//@Autowired
	private TeacherRepository teacherRepo;
	
	// @Autowired
	 private TestEntityManager entityManager;
	
		
	//@Test
	public void whenFindByName_thenReturnTeacher() {
	    
		Teacher testTeacher1 = new Teacher("smithj", "12345", "John", "Smith",	
	    		"john.smith@university.com", "(111) 222-3344", "1 Test Drive",	"Test City", "NY", "11235", "Math Professor", Date.valueOf("11/12/2000") );

	    Teacher testTeacher2 = new Teacher("smitha", "43545", "Alex", "Smith",	
	    		"alex.smith@teacher.com", "(111) 345-7675", "100 Test Circle",	"Test City", "NY", "10110", "History Professor", Date.valueOf("01/012/2005") );

	    entityManager.persist(testTeacher1);
	    entityManager.flush();
	    entityManager.persist(testTeacher2);
	    entityManager.flush();
	    
	    
	    List<Teacher> foundTeachers = teacherRepo.findByLastName("Smith");
	    
	    Assertions.assertEquals("Smith", foundTeachers.get(0).getLastName());
	    Assertions.assertEquals("Smith", foundTeachers.get(1).getLastName());
	}//public void whenFindByName_thenReturnTeacher


	
	
	
}
