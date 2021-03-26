package com.StudentTeacherPortal.victoria.geykhman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherServiceInterface;


@Controller
public class TeacherController {
	
	@Autowired
	private TeacherServiceInterface teacherService;
	
	//@RequestMapping( value={ "/manage-faculty", "/manage-faculty/last-name/{lastName}", "/manage-faculty/id/{id}" }, method = RequestMethod.GET)
	@RequestMapping( value={ "/manage-faculty" })
    public String manageFaculty(@RequestParam(name="lastName", required=false) String lastName, @RequestParam(name="id", required=false) Long id, ModelMap model){
        if( lastName != null ) {
        	 List<Teacher> teachers = teacherService.findTeacherByLastName(lastName);             
             model.put("foundTeachers", teachers);
        }
        if( id != null ) {
        	//todo
        }
		
		return "manage-faculty";
    }
    
}//public class TeacherController
