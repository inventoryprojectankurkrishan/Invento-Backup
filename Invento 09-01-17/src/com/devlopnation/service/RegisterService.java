package com.devlopnation.service;

import java.sql.SQLException;

import com.devlopnation.helper.RegisterHelper;
import com.devlopnation.users.dao.RegisterDAO;
import com.devlopnation.users.dto.RegisterDTO;

public class RegisterService {

	public boolean doRegisterService (RegisterDTO registerDTO) throws ClassNotFoundException, SQLException{
		
		RegisterHelper registerHelper = new RegisterHelper();
		boolean result =registerHelper.doRegisterHelper(registerDTO);	
		return result;
	}
}
