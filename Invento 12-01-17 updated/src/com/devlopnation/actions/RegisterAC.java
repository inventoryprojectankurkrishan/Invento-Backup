package com.devlopnation.actions;

import java.sql.SQLException;

import com.devlopnation.service.RegisterService;
import com.devlopnation.users.dto.RegisterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAC extends ActionSupport 
{
	
	private String userid ;
	private String password;
	private String message ;
	private boolean registerDTOObject;
	
	
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

		registerDTO.setUserid(userid);

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
