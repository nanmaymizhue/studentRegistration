package com.example.studentRegistration.entity;


import java.io.Serializable;
import java.util.Date;
import java.util.List;


import javax.persistence.*;


@Entity
@Table(name = "student")
public class Student implements Serializable {
	 
	private static final long serialVersionUID = 1L;
     
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long studentId;

    private String studentName;
     
    private String age;
     
    private String course;
	
    private String gender;
	
    private String dob;
    
    private String address;

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
	
	
	
}
