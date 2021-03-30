package com.StudentTeacherPortal.victoria.geykhman.service;

import java.util.List;

import com.StudentTeacherPortal.victoria.geykhman.model.Student;

public interface StudentServiceInterface {
	public List<Student> getAllStudents();
	public List<Student> findStudentByLastName(String lastName);
	public List<Student> findStudentById(Long id);

}
