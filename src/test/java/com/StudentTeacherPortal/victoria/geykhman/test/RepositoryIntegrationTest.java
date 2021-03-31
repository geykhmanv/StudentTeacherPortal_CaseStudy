package com.StudentTeacherPortal.victoria.geykhman.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;
import com.StudentTeacherPortal.victoria.geykhman.model.Student;
import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.service.CourseServiceInterface;
import com.StudentTeacherPortal.victoria.geykhman.service.StudentServiceInterface;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherServiceInterface;

//@DataJpaTest
@SpringBootTest
public class RepositoryIntegrationTest {
	
	@Autowired
	private TeacherServiceInterface teacherService;
	
	@Autowired
	private CourseServiceInterface courseService;
	
	@Autowired StudentServiceInterface studentService;
	
	//TeacherService Tests
	@Test
	public void whenFindByName_thenReturnTeacher() {	   
	    List<Teacher> foundTeachers = teacherService.findTeacherByLastName("Smith");
	    Assertions.assertTrue(!foundTeachers.isEmpty());  
	}//public void whenFindByName_thenReturnTeacher
	
	@Test public void whenFindById_thenReturnTeacher() {
		List<Teacher> foundTeachers = teacherService.findTeacherById((long) 1);
		Assertions.assertTrue(!foundTeachers.isEmpty());
	}
	
	@Test public void whenGetAllTeachers_thenReturnTeachers() {
		List<Teacher> foundTeachers = teacherService.getAllTeachers();
		Assertions.assertTrue(!foundTeachers.isEmpty());
	}
	
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

}//public class RepositoryIntegrationTest 
