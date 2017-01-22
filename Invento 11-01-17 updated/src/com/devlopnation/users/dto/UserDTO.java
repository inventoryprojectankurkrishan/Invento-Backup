package com.devlopnation.users.dto;

public class UserDTO {

	private String userid;
	private String password;
//	private String userName;
/*	private String salutation;
	private String firstname;
	private String lastname;*/
	
	private RoleDTO roleDTO;
	
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
	
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
	/*public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}*/
	public RoleDTO getRoleDTO() {
		return roleDTO;
	}
	public void setRoleDTO(RoleDTO roleDTO) {
		this.roleDTO = roleDTO;
	}
	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", password=" + password + ", roleDTO=" + roleDTO + "]";
	}
	
	/*@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", password=" + password + ", salutation=" + salutation + ", firstname="
				+ firstname + ", lastname=" + lastname + ", roleDTO=" + roleDTO + "]";
	}*/
	
//	@Override
//	public String toString() {
//		return "UserDTO [userid=" + userid +" UserName  "+userName+" ,  password=" + password + ", roleDTO=" + roleDTO + "]";
//		return "UserDTO [userid=" + userid +" ,  password=" + password + ", roleDTO=" + roleDTO + "]";
//		
//	}
	
	
}
