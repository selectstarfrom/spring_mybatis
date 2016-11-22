package com.frz.springmybatis.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frz.springmybatis.core.dto.StudentDTO;
import com.frz.springmybatis.core.entity.Student;
import com.frz.springmybatis.core.mapper.StudentMapper;
import com.frz.springmybatis.service.service.IStudentService;

/**
 * @author syed
 *
 */
@Service("studentServiceImpl")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Transactional
	public void createStudent(StudentDTO pStudent) {
		
		Student lStudent = new Student();
		
		lStudent.setDateOfBirth(pStudent.getDateOfBirth());
		lStudent.setEmailAddress(pStudent.getEmailAddress());
		lStudent.setFirstName(pStudent.getFirstName());
		lStudent.setLastName(pStudent.getLastName());
		lStudent.setPassword(pStudent.getPassword());
		lStudent.setUserName(pStudent.getUserName());
		
		studentMapper.insertStudent(lStudent);
	}

}