package com.example.studentRegistration.service;


import java.util.List;
import java.util.Optional;

import com.example.studentRegistration.entity.Student;
import com.example.studentRegistration.model.StudentModel;



public interface StudentService {

	public List<Student> getAllStudents();
	
	public StudentModel getStudentById(Long studentId);
	
	public StudentModel saveStudent(StudentModel studentModel);
	
	public StudentModel updateStudent(StudentModel studentModel);
	
	public void deleteStudent(Long studentId);
}
