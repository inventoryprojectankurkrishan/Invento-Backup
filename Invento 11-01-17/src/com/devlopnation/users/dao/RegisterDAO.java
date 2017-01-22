package com.devlopnation.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.devlopnation.common.dao.CommonDAO;
import com.devlopnation.common.dao.CommonSQL;
import com.devlopnation.users.dto.RegisterDTO;

public class RegisterDAO {
	public boolean doRegister(RegisterDTO registerDTO) throws ClassNotFoundException, SQLException
	{
		//ArrayList<RegisterDTO> userList= new ArrayList <RegisterDTO>();
		Connection con = null;
		PreparedStatement pstmt1 = null;
/*		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		PreparedStatement pstmt4 = null;
		PreparedStatement pstmt5 = null;
	
		ResultSet rs3 =null;
		ResultSet rs4 =null;
*/		
		boolean result=false;
	 
		//RegisterDTO registerDTOObject = null;
		try
		{
			con = CommonDAO.getConnection();
			/*con.setAutoCommit(false);*/
			//con=CommonDAO.getConnection();
			pstmt1=con.prepareStatement(CommonSQL.REGISTER_USER_SQL);
			pstmt1.setString(1, registerDTO.getUserid());
			pstmt1.setString(2, registerDTO.getPassword());
/*	*/		pstmt1.setString(3,"N");
			int noOfRowsEffected1 = pstmt1.executeUpdate();
			if(noOfRowsEffected1>0)
			{
			result=true;	
			}
			
			/*if(noOfRowsEffected1>0)
			{
				con.commit();
			}
			else{
				con.rollback();
			}*/
/*			if(noOfRowsEffected>0)
			{
				result = true;
			}
*/			
			/*pstmt2=con.prepareStatement(CommonSQL.REGISTER_USER_NAME_SQL);
			pstmt2.setString(1, registerDTO.getSalutation());
			pstmt2.setString(2, registerDTO.getFirstname());
			pstmt2.setString(3, registerDTO.getLastname());
			int noOfRowsEffected2 = pstmt2.executeUpdate();
*/
/*pstmt3=con.prepareStatement(CommonSQL.GET_USER_ID);
			pstmt3.setString(1, registerDTO.getUserid());
			rs3=pstmt3.executeQuery();
			int uid =rs3.getInt("uid") ;
*/			
			/*pstmt4 =con.prepareStatement(CommonSQL.GET_USER_NAME);
			rs4=pstmt4.executeQuery();
			int nameid=rs4.getInt("nameid");
*/			
			/*pstmt5 = con.prepareStatement(CommonSQL.SET_USER_MASTER_NAME_MAPPING_TABLE);
			pstmt5.setInt(1, uid);
			pstmt5.setInt(2, nameid);
			int noOfRowsEffected5 =pstmt5.executeUpdate();
*/			
			
			/*if(noOfRowsEffected1>0&&noOfRowsEffected2>0&&noOfRowsEffected5>0)
			{
				con.commit();	
				result=true;
			}
			else
			{
				con.rollback();
				result=false;
			}*/
		}
		finally
		{
			/*if(rs!=null){
				rs.close();
			}*/
			/*if(pstmt5!=null){
				pstmt5.close();
			}
			if(rs4!=null){
				rs4.close();
			}
			if(pstmt4!=null){
				pstmt4.close();
			}
			if(rs3!=null){
				rs3.close();
			}
			if(pstmt3!=null){
				pstmt3.close();
			}
			if(pstmt2!=null){
				pstmt2.close();
			}*/
			if(pstmt1!=null){
				pstmt1.close();
			}
			if(con!=null){
				con.close();
			}
		}
		return result;

	}
}
