package com.StudentTeacherPortal.victoria.geykhman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	
	@RequestMapping(value = "/teacher-by-name/{lastName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Teacher> findTeacherByName(@PathVariable("lastName") String lastName) {
        
       List<Teacher> teachers = teacherService.findTeacherByName(lastName);
        
       return teachers;
    }// public List<Teacher> findTeacherByName
    
}
