package com.devlopnation.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.devlopnation.common.dao.CommonDAO;
import com.devlopnation.common.dao.CommonSQL;
import com.devlopnation.users.dto.UserDTO;

public class LastLoginDAO {

	public boolean setLastLogin(UserDTO userDTO) throws SQLException, ClassNotFoundException{
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		boolean lastLogin =false;
		Date date = new Date();
		 
		 
		 try{
			 con= CommonDAO.getConnection();
			 pstmt=con.prepareStatement(CommonSQL.SET_LAST_LOGIN);
			 pstmt.setString(1, date.toString());
			 pstmt.setString(2, userDTO.getUserid());
			 //pstmt.setString(3, userDTO.getPassword());
			  int noOfRowsAffected = pstmt.executeUpdate();
			 if(noOfRowsAffected>0)
			 {
				lastLogin=true; 
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
		 
		return lastLogin;
	}
	
	
}
