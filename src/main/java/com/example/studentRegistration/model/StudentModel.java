package com.example.studentRegistration.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.example.studentRegistration.entity.Student;

import java.util.List;

public class StudentModel{
	 
    private Long studentId;
    
	@NotNull(message = "Student name is required")
    private String studentName;
     
	@NotNull(message = "Age is required")
    private String age;
     
	@NotNull(message = "Course is required")
    private String course;
	
	@NotNull(message = "Gender is required")
    private String gender;
	
	@NotNull(message = "DOB is required")
    private String dob;	
	
	
	@NotNull(message = "Address is required")
    private String address;
	
	private List<Student> studentList;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	
}
