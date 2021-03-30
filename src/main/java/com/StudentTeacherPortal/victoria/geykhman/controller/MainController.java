package com.StudentTeacherPortal.victoria.geykhman.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



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
	
	
	
	@RequestMapping(value="/register-student", method = RequestMethod.GET)
    public String registerStudent(ModelMap model){
        return "register-student";
    }
	
	
	

}//public class MainController