package com.pawan.studentop.STUDENTOP;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class AddStudentDetails {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name,section,branch,collageName;
	private long fee,rollNum,age;
	
	
//	private CourseStructure course;
//	public CourseStructure getCourse() {
//		return course;
//	}
//	public void setCourse(CourseStructure course) {
//		this.course = course;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public long getRollNum() {
		return rollNum;
	}
	public void setRollNum(long rollNum) {
		this.rollNum = rollNum;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}

}
