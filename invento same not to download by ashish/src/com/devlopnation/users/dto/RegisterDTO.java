package com.devlopnation.users.dto;

public class RegisterDTO {
//	private  String Username;
	private String userid ;
	private String email;
	private String password;
	private String message ;
//	public String getUsername() {
//		return Username;
//	}
//	public void setUsername(String username) {
//		Username = username;
//	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
