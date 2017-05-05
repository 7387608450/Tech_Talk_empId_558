package com.app.pojos;

public class UserRequestingTicToc {

	private String emailId;
	private String topic;
	private String date;
	
	
	public UserRequestingTicToc() {
		super();
	}


	public UserRequestingTicToc(String emailId, String topic, String date) {
		super();
		this.emailId = emailId;
		this.topic = topic;
		this.date = date;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "UserRequestingTicToc [emailId=" + emailId + ", topic=" + topic + ", date=" + date + "]";
	}
	

	
}
