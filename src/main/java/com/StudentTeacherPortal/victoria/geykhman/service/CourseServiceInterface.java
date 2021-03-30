package com.StudentTeacherPortal.victoria.geykhman.service;

import java.util.List;

import com.StudentTeacherPortal.victoria.geykhman.model.Course;

public interface CourseServiceInterface {
	public List<Course> getAllCourses();
	public List<Course> getNonRegisteredCourses();
	public void addCourseToTeacher(Long teacherId, Long courseId);
	public List<Course> findCourseByName(String courseName);
	public List<Course> findCourseById(Long id);

}//public interface CourseServiceInterface
