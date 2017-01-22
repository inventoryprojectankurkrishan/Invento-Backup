package com.devlopnation.service;
import java.sql.SQLException;
import com.devlopnation.helper.LastLoginHelper;
import com.devlopnation.users.dto.UserDTO;
public class LastLoginService {
	public boolean setLastLoginService (UserDTO userDTO) throws ClassNotFoundException, SQLException{
		LastLoginHelper lastLoginHelper = new LastLoginHelper();
		boolean lastLogin=lastLoginHelper.setLastLoginHelper(userDTO);		
		return lastLogin;
	}
}
