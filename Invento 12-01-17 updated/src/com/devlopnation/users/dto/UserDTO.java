package com.devlopnation.users.dto;

public class UserDTO {

	private String userid;
	private String password;

	private NameDTO name;
	private RoleDTO roleDTO;
	
	
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
	public RoleDTO getRoleDTO() {
		return roleDTO;
	}
	public void setRoleDTO(RoleDTO roleDTO) {
		this.roleDTO = roleDTO;
	}
	
	
	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", password=" + password + ", name=" + name + ", roleDTO=" + roleDTO + "]";
	}
	
}
