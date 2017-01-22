package com.devlopnation.actions;

import java.sql.SQLException;

import com.devlopnation.users.dao.UserDAO;
import com.devlopnation.users.dto.UserDTO;
import com.opensymphony.xwork2.Action;

public class LoginAC implements Action {
	private String userid;
	private String password;
	private String message;
	private UserDTO userDTOObject;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
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
	public String doLogin(){
		String result = ERROR;
		if(isValid()){
			message = userDTOObject.toString();
			setUserDTOObject(userDTOObject);
			result = SUCCESS;
		}
		else
		{
			message = "Invalid Username or Password";
		}
		return result;
	}
	public UserDTO getUserDTOObject() {
		return userDTOObject;
	}
	public void setUserDTOObject(UserDTO userDTOObject) {
		this.userDTOObject = userDTOObject;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isValid(){
		boolean getResult = false;
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		UserDAO userDAO = new UserDAO();
		try {
			userDTOObject = userDAO.isUserExist(userDTO);
			if(userDTOObject!=null && userDTOObject.getUserName()!=null){
				getResult = true;
			}
			else{
				getResult = false;
			}
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getResult;
	}
}
