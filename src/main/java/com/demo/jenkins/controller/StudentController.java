package com.demo.jenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jenkins.model.Student;
import com.demo.jenkins.respository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(method = RequestMethod.GET,path = "/all")
	public ResponseEntity<Student> getAllStudent(){
		return new ResponseEntity(studentRepository.findAll(), HttpStatus.OK) ;
	}
}
