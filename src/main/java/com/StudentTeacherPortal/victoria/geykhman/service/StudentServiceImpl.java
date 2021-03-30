package com.StudentTeacherPortal.victoria.geykhman.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentTeacherPortal.victoria.geykhman.model.Student;
import com.StudentTeacherPortal.victoria.geykhman.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceInterface {

	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}


	public List<Student> findStudentByLastName(String lastName) {
		return studentRepo.findByLastName(lastName);
	}


	public List<Student> findStudentById(Long id) {
		Student student = studentRepo.getById(id);
		List<Student> students = new ArrayList<Student>();
		students.add(student);
		
		return students;
	}

}//public class StudentServiceImpl implements StudentServiceInterface
