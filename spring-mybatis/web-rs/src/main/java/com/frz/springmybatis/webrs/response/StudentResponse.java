package com.frz.springmybatis.webrs.response;

import java.util.List;

import com.frz.springmybatis.core.dto.StudentDTO;

/**
 * @author syed
 *
 */
public class StudentResponse {

	private List<StudentDTO> students;

	public void setStudents(List<StudentDTO> pStudentDTOs) {
		students = pStudentDTOs;
	}

	public List<StudentDTO> getStudents() {
		return students;
	}

}