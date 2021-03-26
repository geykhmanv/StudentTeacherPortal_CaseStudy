package com.StudentTeacherPortal.victoria.geykhman.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.repository.TeacherRepository;



@Service
public class TeacherServiceImpl implements TeacherServiceInterface {
	
	@Autowired
	private TeacherRepository teacherRepo;
	
	public List<Teacher> findTeacherByLastName(String lastName){
		return teacherRepo.findByLastName(lastName);
	}
	
	public List<Teacher> findTeacherById(Long id) {
		Teacher teacher = teacherRepo.getById(id);
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(teacher);
		
		return teachers;
	}

}//public class TeacherServiceImpl implements TeacherServiceInterface
