package com.StudentTeacherPortal.victoria.geykhman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherServiceInterface;


@Controller
public class TeacherController {
	
	@Autowired
	private TeacherServiceInterface teacherService;
	
	
	@RequestMapping(value = "/teacher-by-name/{lastName}", method = RequestMethod.GET)
    public String findTeacherByName(@PathVariable("lastName") String lastName, ModelMap model) {
        
       List<Teacher> teachers = teacherService.findTeacherByLastName(lastName);
       
       model.put("foundTeachers", teachers);
        
       return "manage-faculty";
    }// public List<Teacher> findTeacherByName
    
}
