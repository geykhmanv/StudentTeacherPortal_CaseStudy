package com.StudentTeacherPortal.victoria.geykhman.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String courseName;
	private int maxStudents;


	public Course() {
		super();
	}

	public Course(long id, String courseName, int maxStudents) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.maxStudents = maxStudents;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Column(name = "max_students", nullable = false)
	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", maxStudents=" + maxStudents + "]";
	}
	
	
	
	

}//public class Course
