package com.StudentTeacherPortal.victoria.geykhman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;
import com.StudentTeacherPortal.victoria.geykhman.service.CourseServiceInterface;

@Controller
public class CourseController {
	
	@Autowired
	private CourseServiceInterface courseService;
	
	
	@RequestMapping( value="/manage-classes")
    public String manageClasses(@RequestParam(name="courseName", required=false) String courseName, @RequestParam(name="id", required=false) Long id, ModelMap modelMap){

		modelMap.clear();
		List<Course> courses = null;
		
		if( courseName != null && !courseName.trim().isEmpty()) {
        	 courses = courseService.findCourseByName(courseName); 
             modelMap.put("searchCriteriaCourseName", courseName);
        }
		else if( id != null ) {
			courses = courseService.findCourseById(id);
        	modelMap.put("searchCriteriaId", id);
        } else {
        	courses = courseService.getAllCourses();
        }
		
		modelMap.put("courses", courses);
		
		return "manage-classes";
    }//public String manageClasses

}//public class CourseController
