package com.frz.springmybatis.client.constants;
/**
 * @author syed
 *
 */
public class RestURL {
	
	private final static String SERVER = "localhost";

	public static final String REST_GET_ALL_STUDENTS = "http://" + SERVER + ":8080/web-rs/student/get_all_students";

	public static final String REST_SAVE_STUDENT = "http://" + SERVER + ":8080/web-rs/student/create_student";

}
