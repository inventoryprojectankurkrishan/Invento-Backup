package com.devlopnation.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.devlopnation.common.dao.CommonDAO;
import com.devlopnation.common.dao.CommonSQL;
import com.devlopnation.users.dto.RegisterDTO;
import com.devlopnation.users.dto.UserDTO;

public class RegisterDAO {
public boolean doRegister(RegisterDTO registerDTO) throws ClassNotFoundException, SQLException{
	//ArrayList<RegisterDTO> userList= new ArrayList <RegisterDTO>();
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs =null;
	 boolean result=false;
	 
	 Date date = new Date();

	 
	//RegisterDTO registerDTOObject = null;
	try
	{
		con= CommonDAO.getConnection();
		pstmt=con.prepareStatement(" insert into user_master (userid, password,status,lastlogin)"
		        + " values (?, ?, ?, ? )");
		pstmt.setString(1, registerDTO.getUserid());
		pstmt.setString(2, registerDTO.getPassword());
		//pstmt.setString(3,registerDTO.getUsername());
		pstmt.setString(3,"Y");
		pstmt.setString(4,date.toString());
		int noOfRowsEffected = pstmt.executeUpdate();
		if(noOfRowsEffected>0){
			result = true;
			//if(registerDTOObject==null){
				//registerDTOObject= new RegisterDTO();
				//registerDTOObject.setUserid(rs.getString("userid"));
				//registerDTOObject.setUsername(rs.getString("username"));
				
	
			
	}
	}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
	return result;


}
}
