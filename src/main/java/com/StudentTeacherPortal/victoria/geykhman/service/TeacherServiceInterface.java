package com.StudentTeacherPortal.victoria.geykhman.service;

import java.util.List;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;

public interface TeacherServiceInterface {
	public List<Teacher> findTeacherByLastName(String lastName);
}