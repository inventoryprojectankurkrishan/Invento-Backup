package com.devlopnation.helper;

import java.sql.SQLException;

import com.devlopnation.users.dao.UserDAO;
import com.devlopnation.users.dto.UserDTO;

public class LoginHelper {

	public UserDTO isUserExistHelper(UserDTO userDTO) throws ClassNotFoundException, SQLException{
		UserDAO userDAO = new UserDAO();
		UserDTO userDTOObject = userDAO.isUserExist(userDTO);
		
		return userDTOObject;
	}
	
	
	
	
}
