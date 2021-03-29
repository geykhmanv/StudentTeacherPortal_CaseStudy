package com.StudentTeacherPortal.victoria.geykhman.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;
import com.StudentTeacherPortal.victoria.geykhman.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseServiceInterface {

	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	private DataSource dataSource;
	
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	public void addCourseToTeacher(Long teacherId, Long courseId) {
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement("INSERT INTO course_teacher VALUES(?, ?)");
			ps.setLong(1, teacherId);
			ps.setLong(2, courseId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}//public void addCourseToTeacher(Long teacherId, Long courseId)

}//public class CourseServiceImpl
