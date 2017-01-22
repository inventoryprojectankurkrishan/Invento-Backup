package com.devlopnation.service;

import java.sql.SQLException;

import com.devlopnation.helper.LoginHelper;
import com.devlopnation.users.dto.UserDTO;

public class LoginService {

	public UserDTO isUserExistService(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		
		LoginHelper loginHelper = new LoginHelper();
	     UserDTO userDTOObject = loginHelper.isUserExistHelper(userDTO);
		
		return userDTOObject;
	}
	
	
	
	
	
	
	
	
	
}
