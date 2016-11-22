package com.frz.springmybatis.core.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author syed
 *
 */
public class StudentDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5528174546901593048L;

	private Long id;

	private String userName;

	private String firstName;

	private String lastName;

	private String password;

	private String emailAddress;

	private Date dateOfBirth;

	public StudentDTO() {
	}

	public StudentDTO(Long pId, String pUserName, String pFirstName, String pLastName, String pPassword,
			String pEmailAddress, Date pDateOfBirth) {
		super();
		id = pId;
		userName = pUserName;
		firstName = pFirstName;
		lastName = pLastName;
		password = pPassword;
		emailAddress = pEmailAddress;
		dateOfBirth = pDateOfBirth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long pId) {
		id = pId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String pUserName) {
		userName = pUserName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String pFirstName) {
		firstName = pFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String pLastName) {
		lastName = pLastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pPassword) {
		password = pPassword;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String pEmailAddress) {
		emailAddress = pEmailAddress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date pDateOfBirth) {
		dateOfBirth = pDateOfBirth;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", emailAddress=" + emailAddress + ", dateOfBirth=" + dateOfBirth + "]";
	}

}