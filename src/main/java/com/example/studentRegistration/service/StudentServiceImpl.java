package com.example.studentRegistration.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentRegistration.dao.StudentRepository;
import com.example.studentRegistration.entity.Student;
import com.example.studentRegistration.model.StudentModel;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public StudentModel getStudentById(Long studentId) {
		StudentModel studentModel = new StudentModel();
		Student student = studentRepository.findById(studentId).get();
		BeanUtils.copyProperties(student, studentModel);
		return studentModel;
	}

	@Override
	public StudentModel saveStudent(StudentModel studentModel) {
		Student student = new Student();
		BeanUtils.copyProperties(studentModel, student);
		studentRepository.save(student);
		return studentModel;
	}

	@Override
	public StudentModel updateStudent(StudentModel studentModel) {
		Student student = new Student();
		BeanUtils.copyProperties(studentModel, student);
		studentRepository.save(student);
		return studentModel;
	}

	@Override
	public void deleteStudent(Long studentId) {
		studentRepository.deleteById(studentId);
	}

}
