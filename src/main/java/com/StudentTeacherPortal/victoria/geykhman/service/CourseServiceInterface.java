package com.StudentTeacherPortal.victoria.geykhman.service;

import java.util.List;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;


public interface CourseServiceInterface {
	public List<Course> findCourseByName(String name);

}//public interface CourseServiceInterface
