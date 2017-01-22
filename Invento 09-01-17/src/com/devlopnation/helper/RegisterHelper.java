package com.devlopnation.helper;

import java.sql.SQLException;

import com.devlopnation.service.RegisterService;
import com.devlopnation.users.dao.RegisterDAO;
import com.devlopnation.users.dto.RegisterDTO;

public class RegisterHelper {
	public boolean doRegisterHelper(RegisterDTO registerDTO) throws ClassNotFoundException, SQLException
	{
		RegisterDAO registerDAO=new RegisterDAO();
		boolean result =registerDAO.doRegister(registerDTO);
		return result;
	}	
}
