package com.StudentTeacherPortal.victoria.geykhman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.StudentTeacherPortal.victoria.geykhman.service.StudentServiceInterface;

@Controller
public class StudentController {
	
	@Autowired
	StudentServiceInterface studentService;

}//public class StudentController
