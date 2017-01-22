package com.devlopnation.actions;

import java.sql.SQLException;

import com.devlopnation.service.RegisterService;
import com.devlopnation.users.dao.RegisterDAO;
import com.devlopnation.users.dto.RegisterDTO;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAC extends ActionSupport {
	private  String Username;
	private String userid ;
	private String email;
	private String password;
	private String message ;
	private boolean registerDTOObject;
	
	
	public boolean isRegisterDTOObject() {
		return registerDTOObject;
	}
	public void setRegisterDTOObject(boolean registerDTOObject) {
		this.registerDTOObject = registerDTOObject;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
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
public boolean doregister(){
	boolean getresult=false;
	RegisterDTO registerDTO=new RegisterDTO();
	registerDTO.setUserid(userid);
	registerDTO.setEmail(email);
	registerDTO.setPassword(password);
//	registerDTO.setUsername(Username);
	
//	RegisterDAO registerDAO=new RegisterDAO();
	
	RegisterService registerService = new RegisterService();
	
	
	try {
//		registerDTOObject=registerDAO.doRegister(registerDTO);
		registerDTOObject= registerService.doRegisterService(registerDTO);
		if(registerDTOObject==true){
			getresult=true;
		}
		else{
			getresult=false;
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return getresult;
	
}
}
