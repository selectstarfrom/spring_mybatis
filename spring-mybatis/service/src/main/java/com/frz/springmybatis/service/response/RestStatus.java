package com.frz.springmybatis.service.response;

/**
 * @author syed
 *
 */
public enum RestStatus {

	ERROR("Error", "Error Occured"), SUCCESS("Success", "Success"), VALID("VALID", "BLOCKED");

	private String code;
	private String message;

	private RestStatus(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
