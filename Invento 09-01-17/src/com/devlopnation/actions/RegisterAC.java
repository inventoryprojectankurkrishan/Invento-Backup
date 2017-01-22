package com.devlopnation.actions;

import java.sql.SQLException;

import com.devlopnation.service.RegisterService;
import com.devlopnation.users.dao.RegisterDAO;
import com.devlopnation.users.dto.RegisterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAC extends ActionSupport 
{
	
	private String Username;
/*	private String salutation;
	private String firstname;
	private String lastname;
*/	private String userid ;
	private String email;
	private String password;
	private String message ;
	private boolean registerDTOObject;
	
	
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
/*	public String getSalutation() {
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
	}
*/	public String getUserid() {
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
	
	public boolean isRegisterDTOObject() {
		return registerDTOObject;
	}
	public void setRegisterDTOObject(boolean registerDTOObject) {
		this.registerDTOObject = registerDTOObject;
	}
	@Override
	public String execute(){
		String result = ERROR;
		if(doregister()){
			result=SUCCESS;
		}
		else{
			result=ERROR;
		}
		
		
		return result;
	}
	public boolean doregister()
	{
		boolean getresult=false;
		RegisterDTO registerDTO=new RegisterDTO();
//	Do not add at all   --->	registerDTO.setUsername(Username);
/*		registerDTO.setSalutation(salutation);
		registerDTO.setFirstname(firstname);
		registerDTO.setLastname(lastname);
*/		registerDTO.setUserid(userid);
		registerDTO.setEmail(email);
		registerDTO.setPassword(password);

	
	
		RegisterService registerService = new RegisterService();
	
	
		try 
		{
			registerDTOObject= registerService.doRegisterService(registerDTO);
			if(registerDTOObject==true)
			{
				getresult=true;
			}
			else
			{
				getresult=false;
			}
		
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
		e.printStackTrace();
		}
		return getresult;
	}
}
