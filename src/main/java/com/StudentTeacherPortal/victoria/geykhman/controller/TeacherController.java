package com.StudentTeacherPortal.victoria.geykhman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;
import com.StudentTeacherPortal.victoria.geykhman.model.Teacher;
import com.StudentTeacherPortal.victoria.geykhman.service.CourseServiceInterface;
import com.StudentTeacherPortal.victoria.geykhman.service.TeacherServiceInterface;


@Controller
public class TeacherController {
	
	@Autowired
	private TeacherServiceInterface teacherService;
	
	@Autowired
	private CourseServiceInterface courseService;
	
	
	@RequestMapping(value="/add-faculty", method = RequestMethod.GET)
    public String addFaculty(ModelMap modelMap){
		Teacher teacher = new Teacher();
		modelMap.addAttribute("teacher", teacher);
        return "add-faculty";
    }
	
	@PostMapping("/add-faculty")
	public String submitAddFacultyForm(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.addTeacher(teacher);
		System.out.println(teacher);
		return "redirect:/manage-faculty";
	}
	
	@RequestMapping( value={ "/manage-faculty" })
    public String manageFaculty(@RequestParam(name="lastName", required=false) String lastName, @RequestParam(name="id", required=false) Long id, ModelMap modelMap){

		modelMap.clear();
		List<Teacher> teachers = null;
		
		if( lastName != null && !lastName.trim().isEmpty()) {
        	 teachers = teacherService.findTeacherByLastName(lastName);   
             modelMap.put("searchCriteriaLastName", lastName);
        }
		else if( id != null ) {
			teachers = teacherService.findTeacherById(id);
        	modelMap.put("searchCriteriaId", id);
        } else {
        	teachers = teacherService.getAllTeachers();
        }
		
		modelMap.put("teachers", teachers);
		
		return "manage-faculty";
    }//public String manageFaculty
	
	@RequestMapping(value = "deleteFaculty/{id}", method = RequestMethod.GET)
	public String deleteTeacher(@PathVariable("id") Long id) {
		teacherService.deleteTeacher(id);
		return "redirect:/manage-faculty";
	}
	
	@RequestMapping(value={"/update-faculty"})
    public String updateFaculty(@RequestParam(name="id") Long id, ModelMap modelMap){
		List<Teacher> teachers = teacherService.findTeacherById(id);
		modelMap.clear();
		if(teachers != null) modelMap.put("teacher", teachers.get(0));
        return "update-faculty";
    }
	
	@PostMapping("/save-faculty-update")
	public String saveFacultyUpdate(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.updateTeacher(teacher);
		return "redirect:/manage-faculty";
	}
    
	@RequestMapping(value={"/assign-teacher"})
    public String assignTeacher(@RequestParam(name="id") Long id, ModelMap modelMap){
		List<Teacher> teachers = teacherService.findTeacherById(id);
		modelMap.clear();
		if(teachers != null) modelMap.put("teacher", teachers.get(0));
		
		List<Course> courses = courseService.getNonRegisteredCourses();
		if(courses != null) modelMap.put("courses", courses);
		
        return "assign-teacher";
    }
	
	
	@RequestMapping(value = "remove-course-from-teacher/{teacherId}/{courseId}", method = RequestMethod.GET)
	public String removeTeacherCourse(@PathVariable("teacherId") Long teacherId, @PathVariable("courseId") Long courseId, RedirectAttributes redirectAttrs) {
		teacherService.removeCourseFromTeacher(teacherId, courseId);
		redirectAttrs.addAttribute("id", teacherId);
		return "redirect:/assign-teacher";
	}
	
	@RequestMapping("/add-course-to-teacher")
	public String addCourseToTeacher(@RequestParam(name="newCourseId") Long newCourseId, @RequestParam(name="teacherId") Long teacherId, ModelMap modelMap, RedirectAttributes redirectAttrs) {
		courseService.addCourseToTeacher(teacherId, newCourseId);
		redirectAttrs.addAttribute("id", teacherId);
		return "redirect:/assign-teacher";
	}
	
}//public class TeacherController
