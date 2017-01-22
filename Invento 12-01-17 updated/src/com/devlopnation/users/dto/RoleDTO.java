package com.devlopnation.users.dto;

import java.util.ArrayList;
import java.util.HashMap;

public class RoleDTO {
	private String name;
	private String descr;

	HashMap<String, ArrayList<RightDTO> > groupMap;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public HashMap<String, ArrayList<RightDTO>> getGroupMap() {
		return groupMap;
	}
	public void setGroupMap(HashMap<String, ArrayList<RightDTO>> groupMap) {
		this.groupMap = groupMap;
	}

	@Override
	public String toString() {
		return "RoleDTO [name=" + name + ", descr=" + descr + ", groupMap=" + groupMap + "]";
	}
	
	
	
}
