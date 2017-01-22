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

	public RoleDTO getRoleDTOObject() {
		return roleDTOObject;
	}

	public void setRoleDTOObject(RoleDTO roleDTOObject) {
		this.roleDTOObject = roleDTOObject;
	}

	public ArrayList<RightDTO> getRightList() {
		return rightList;
	}

	public void setRightList(ArrayList<RightDTO> rightList) {
		this.rightList = rightList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private RoleDTO roleDTOObject;
	private ArrayList<RightDTO> rightList;
	private String userName;
		
	public String execute() throws Exception {
		return "success";
		
	}
}
