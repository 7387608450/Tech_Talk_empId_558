package com.app.pojos;

public class User {
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	public User() {
		super();
	}
	/**
	 * param ctor
	 * @param firstName
	 * @param lastName
	 * @param emailId
	 * @param password
	 */
	public User(String firstName, String lastName, String emailId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}
	
	
	/**
	 * This ctor is used for login purpose
	 * @param emailId
	 * @param password
	 */
	public User(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * To String method
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", password="
				+ password + "]";
	}
	
	

	
}
