package com.devlopnation.actions;

import java.sql.SQLException;

import com.devlopnation.service.LastLoginService;
import com.devlopnation.service.LoginService;
import com.devlopnation.users.dto.UserDTO;
import com.opensymphony.xwork2.Action;

public class LoginAC implements Action
{
	private String userid;
	private String password;
	private String message;
	private UserDTO userDTOObject;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserDTO getUserDTOObject() {
		return userDTOObject;
	}
	public void setUserDTOObject(UserDTO userDTOObject) {
		this.userDTOObject = userDTOObject;
	}
	
	public String doLogin() throws ClassNotFoundException, SQLException{
		String result = ERROR;
		if(isValid()){
			message = userDTOObject.toString();
			setUserDTOObject(userDTOObject);
			result = SUCCESS;
			LastLoginService lastLoginService =new LastLoginService();
			boolean lastLogin=(lastLoginService.setLastLoginService(userDTOObject));
			if(lastLogin){
				result=SUCCESS;
			}
			else{
				result=ERROR;
				message="Login Problem";
			}
		}
		else
		{
			message = "Invalid Username or Password";
		}
		return result;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isValid()
	{
		boolean getResult = false;
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		//UserDAO userDAO = new UserDAO();
		LoginService loginService = new LoginService();
		try 
		{
			//userDTOObject = userDAO.isUserExist(userDTO);
			userDTOObject = loginService.isUserExistService(userDTO);
			//if(userDTOObject!=null && userDTOObject.getUsername()!=null){
			if(userDTOObject!=null && userDTOObject.getUserid()!=null)
			{
//			if(userDTOObject!=null){
								
				getResult = true;
			}
			else
			{
				getResult = false;
			}
			} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getResult;
	}
}
