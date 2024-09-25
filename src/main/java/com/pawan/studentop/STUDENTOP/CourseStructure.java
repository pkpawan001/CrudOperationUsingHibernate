package com.pawan.studentop.STUDENTOP;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class CourseStructure {
	@Id
	private int courseId;
	private int courseFee;
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	private String courseName;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
