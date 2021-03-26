package com.StudentTeacherPortal.victoria.geykhman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value="/StudentTeacherPortal", method = RequestMethod.GET)
    public String index(ModelMap model){
        return "index";
    }

}