package com.devlopnation.actions;

import java.util.ArrayList;

import com.devlopnation.users.dto.RightDTO;
import com.devlopnation.users.dto.RoleDTO;
import com.devlopnation.users.dto.UserDTO;

public class DashboardAC {
	
	private UserDTO userDTOObject;
	public UserDTO getUserDTOObject() {
		return userDTOObject;
	}

	public void setUserDTOObject(UserDTO userDTOObject) {
		this.userDTOObject = userDTOObject;
	}
		
	public String execute() throws Exception {
		return "success";
		
	}
}

