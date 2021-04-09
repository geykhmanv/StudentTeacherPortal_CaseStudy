package com.StudentTeacherPortal.victoria.geykhman.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentTeacherPortal.victoria.geykhman.exceptions.teacherNotFoundException;
import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.repository.TeacherRepository;



@Service
public class TeacherServiceImpl implements TeacherServiceInterface {
	
	@Autowired
	private TeacherRepository teacherRepo;
	
	@Autowired
	private DataSource dataSource;
	
	public List<Teacher> findTeacherByLastName(String lastName){
		return teacherRepo.findByLastName(lastName);
	}
	
	public List<Teacher> findTeacherById(Long id) {
		List<Teacher> teachers = new ArrayList<Teacher>();
		
		try {
			Teacher teacher = teacherRepo.getById(id);
			if(teacher == null) {
				throw new teacherNotFoundException();
			}
			teachers.add(teacher);
		}catch(teacherNotFoundException e) {
			e.printStackTrace();
			return teachers;
		}

		return teachers;
	}//public List<Teacher> findTeacherById(Long id)
	
	public Teacher findOneTeacherById(Long id) {
		Teacher teacher = null;
		try {
			teacher = teacherRepo.getById(id);
		}catch(Exception e) {
			e.printStackTrace();						
		}
		return teacher;
	}
	
	public List<Teacher> getAllTeachers() {
		return teacherRepo.findAll();
	}
	
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	public void deleteTeacher(Long id) {
		teacherRepo.deleteById(id);
	}
	
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	
	public void removeCourseFromTeacher(Long teacherId, Long courseId) {
		
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement("DELETE FROM course_teacher WHERE teacher_id = ? AND courses_id = ?");
			ps.setLong(1, teacherId);
			ps.setLong(2, courseId);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//public void removeCourseFromTeacher(Long teacherId, Long courseId)

}//public class TeacherServiceImpl implements TeacherServiceInterface
