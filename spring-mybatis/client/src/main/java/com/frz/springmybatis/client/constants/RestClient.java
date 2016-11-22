package com.frz.springmybatis.client.constants;

import java.util.Date;

import org.springframework.web.client.RestTemplate;

import com.frz.springmybatis.core.dto.StudentDTO;
import com.frz.springmybatis.service.response.CreateStudentResponse;
import com.frz.springmybatis.service.response.RestStatus;

/**
 * @author syed
 *
 */
public class RestClient {

	public static void main(String[] args) {

		RestClient lClient = new RestClient();

		StudentDTO pStudentDTO = new StudentDTO();

		pStudentDTO.setDateOfBirth(new Date());
		pStudentDTO.setEmailAddress("syed@testmail.com");
		pStudentDTO.setFirstName("test_firstname");
		pStudentDTO.setId(0L);
		pStudentDTO.setLastName("test_lastname");
		pStudentDTO.setPassword("test_pass");
		pStudentDTO.setUserName("test_user");

		lClient.saveStudent(pStudentDTO);
	}

	public CreateStudentResponse saveStudent(StudentDTO pStudentDTO) {

		RestTemplate restTemplate = new RestTemplate();
		CreateStudentResponse response = restTemplate.postForObject(RestURL.REST_SAVE_STUDENT, pStudentDTO,
				CreateStudentResponse.class);

		if (response.getStatus().equals(RestStatus.SUCCESS)) {
			Long lId = response.getStudentDTO().getId();
			pStudentDTO.setId(lId);
		}
		return response;
	}
}
