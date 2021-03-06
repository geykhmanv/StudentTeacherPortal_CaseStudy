package com.StudentTeacherPortal.victoria.geykhman.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

	public List<Course> getNonRegisteredCourses() {
		List<Course> nonRegisteredCourses = new ArrayList<>();
		try {
			Connection connection = dataSource.getConnection();
			String sql = "SELECT course.course_name, course.id "
						+ "FROM course "
						+ "WHERE NOT EXISTS"
							+ "(SELECT * "
							+ "FROM course_teacher "
							+ "WHERE course.id = course_teacher.courses_id) ";
			//System.out.println(sql);
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			while(resultSet.next()) {
				Course course = new Course();
				course.setId(resultSet.getLong("id"));
				course.setCourseName(resultSet.getString("course_name"));
				nonRegisteredCourses.add(course);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nonRegisteredCourses;
	}//public List<Course> getNonRegisteredCourses()

	public List<Course> findCourseByName(String courseName) {
		return courseRepo.findByCourseName(courseName);
	}

	public List<Course> findCourseById(Long id) {
		Course course = courseRepo.getById(id);
		List<Course> courses = new ArrayList<Course>();
		courses.add(course);
		
		return courses;
	}

}//public class CourseServiceImpl
