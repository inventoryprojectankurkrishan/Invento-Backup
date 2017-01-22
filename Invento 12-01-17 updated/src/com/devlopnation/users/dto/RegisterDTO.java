package com.devlopnation.users.dto;

public class RegisterDTO {
	
	private String userid ;
	private String password;

	private NameDTO name;
	private String message ;


	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public NameDTO getName() {
		return name;
	}
	public void setName(NameDTO name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "RegisterDTO [userid=" + userid + ", password=" + password + ", name=" + name + ", message=" + message
				+ "]";
	}
}
