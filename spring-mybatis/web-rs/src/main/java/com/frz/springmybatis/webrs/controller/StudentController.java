package com.frz.springmybatis.webrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.frz.springmybatis.core.dto.StudentDTO;
import com.frz.springmybatis.service.response.CreateStudentResponse;
import com.frz.springmybatis.service.service.IStudentService;
import com.frz.springmybatis.webrs.response.StudentResponse;

/**
 * @author syed
 *
 */
@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	@Qualifier("studentServiceImpl")
	private IStudentService studentService;
	
	@RequestMapping(value = "/say_hello", method = RequestMethod.GET)
	public String sayHello() {
		return "hello";
	}

	@RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
	public StudentResponse getAllStudents(StudentDTO pStudentDTO) {
		StudentResponse lResponse = new StudentResponse();
		studentService.createStudent(pStudentDTO);
		return lResponse;
	}

	@RequestMapping(value = "/create_student", method = RequestMethod.POST)
	public CreateStudentResponse signup(@RequestBody StudentDTO pStudentDTO) {
		CreateStudentResponse lResponse = new CreateStudentResponse();
		studentService.createStudent(pStudentDTO);
		return lResponse;
	}
}