package com.StudentTeacherPortal.victoria.geykhman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentTeacherPortal.victoria.geykhman.model.Student;
import com.StudentTeacherPortal.victoria.geykhman.service.StudentServiceInterface;

@Controller
public class StudentController {
	
	@Autowired
	StudentServiceInterface studentService;
	
	@RequestMapping( value={ "/manage-students" })
    public String manageStudents(@RequestParam(name="lastName", required=false) String lastName, @RequestParam(name="id", required=false) Long id, ModelMap modelMap){

		modelMap.clear();
		List<Student> students = null;
		
		if( lastName != null && !lastName.trim().isEmpty()) {
        	 students = studentService.findStudentByLastName(lastName); 
             modelMap.put("searchCriteriaLastName", lastName);
        }
		else if( id != null ) {
			students = studentService.findStudentById(id);
        	modelMap.put("searchCriteriaId", id);
        } else {
        	students = studentService.getAllStudents();
        }
		
		modelMap.put("students", students);
		
		return "manage-students";
    }//public String manageStudents

}//public class StudentController
