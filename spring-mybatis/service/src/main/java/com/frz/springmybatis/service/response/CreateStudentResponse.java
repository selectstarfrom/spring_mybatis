package com.frz.springmybatis.service.response;

import com.frz.springmybatis.core.dto.StudentDTO;

/**
 * @author syed
 *
 */
public class CreateStudentResponse extends AbstractRestResponse {

	private StudentDTO studentDTO;
	
	public StudentDTO getStudentDTO() {
		return studentDTO;
	}

	public void setStudentDTO(StudentDTO pStudentDTO) {
		studentDTO = pStudentDTO;
	}

}