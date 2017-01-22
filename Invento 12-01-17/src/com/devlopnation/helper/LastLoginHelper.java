package com.devlopnation.helper;

import java.sql.SQLException;

import com.devlopnation.users.dao.LastLoginDAO;
import com.devlopnation.users.dto.UserDTO;

public class LastLoginHelper {

	public boolean setLastLoginHelper (UserDTO userDTO) throws  SQLException, ClassNotFoundException{
		
		LastLoginDAO lastLoginDAO = new LastLoginDAO();
		boolean lastLogin = lastLoginDAO.setLastLogin(userDTO);
		
		return lastLogin;
	}
	
	
}
