package com.StudentTeacherPortal.victoria.geykhman.controller;

import java.util.List;
import java.util.Optional;

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
public class MainController {	
	
	
	@RequestMapping(value="/StudentTeacherPortal", method = RequestMethod.GET)
    public String index(ModelMap model){
        return "index";
    }
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
    public String goHome(ModelMap model){
        return "index";
    }
	
	@RequestMapping(value="/dashboard", method = RequestMethod.GET)
    public String dashboard(ModelMap model){
        return "dashboard";
    }
	
	@RequestMapping(value="/manage-students", method = RequestMethod.GET)
    public String manageStudents(ModelMap model){
        return "manage-students";
    }
	
		
	@RequestMapping(value="/manage-classes", method = RequestMethod.GET)
    public String manageClasses(ModelMap model){
        return "manage-classes";
    }
	
	@RequestMapping(value="/register-student", method = RequestMethod.GET)
    public String registerStudent(ModelMap model){
        return "register-student";
    }
	

}//public class MainController