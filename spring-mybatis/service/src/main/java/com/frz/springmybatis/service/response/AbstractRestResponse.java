package com.frz.springmybatis.service.response;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syed
 *
 */
public class AbstractRestResponse {

	private RestStatus status = RestStatus.SUCCESS;

	private List<String> errorMessage;

	public RestStatus getStatus() {
		return status;
	}

	public void setStatus(RestStatus pStatus) {
		status = pStatus;
	}

	public List<String> getErrorMessage() {
		errorMessage = errorMessage == null ? new ArrayList<String>() : errorMessage;
		return errorMessage;
	}

	public void setErrorMessage(List<String> pErrorMessage) {
		errorMessage = pErrorMessage;
	}

}