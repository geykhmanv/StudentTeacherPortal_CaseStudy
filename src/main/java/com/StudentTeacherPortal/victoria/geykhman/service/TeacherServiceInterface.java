package com.StudentTeacherPortal.victoria.geykhman.service;

import java.util.List;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;

public interface TeacherServiceInterface {
	public List<Teacher> findTeacherByLastName(String lastName);
	public List<Teacher> findTeacherById(Long id);
	public List<Teacher> getAllTeachers();
	public Teacher addTeacher(Teacher teacher);
	public void deleteTeacher(Long id);
	public Teacher updateTeacher(Teacher teacher);
	public void removeCourseFromTeacher(Long teacherId, Long courseId);
	
	
}//public interface TeacherServiceInterface
