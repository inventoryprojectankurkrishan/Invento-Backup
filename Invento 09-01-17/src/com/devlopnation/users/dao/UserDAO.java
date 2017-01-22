package com.devlopnation.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.devlopnation.common.dao.CommonDAO;
import com.devlopnation.common.dao.CommonSQL;
import com.devlopnation.users.dto.GroupDTO;
import com.devlopnation.users.dto.RightDTO;
import com.devlopnation.users.dto.RoleDTO;
import com.devlopnation.users.dto.UserDTO;

public class UserDAO {
	public UserDTO isUserExist(UserDTO userDTO) throws SQLException, ClassNotFoundException{
//		ArrayList<UserDTO> userList= new ArrayList <UserDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		UserDTO userDTOObject = null;
		RoleDTO roleDTO = null;
		HashMap<String, ArrayList<RightDTO> > groupMap = new HashMap<>();
		ArrayList<RightDTO> rightList = new ArrayList<RightDTO>();
		try
		{
			con= CommonDAO.getConnection();
			pstmt=con.prepareStatement(CommonSQL.USER_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				if(userDTOObject==null)
				{
					userDTOObject= new UserDTO();
					userDTOObject.setUserid(rs.getString("userid"));	
//					userDTOObject.setUserName(rs.getString("username"));
//					userDTOObject.setSalutation(rs.getString("salutation"));
//					userDTOObject.setFirstname(rs.getString("firstname"));
//					userDTOObject.setLastname(rs.getString("lastname"));
				}
				if(roleDTO==null)
				{
					roleDTO= new RoleDTO();
					roleDTO.setName(rs.getString("rolename"));
					roleDTO.setDescr(rs.getString("roledescr"));
				}
				
				/*GroupDTO groupDTO = new GroupDTO();
				groupDTO.setName(rs.getString("name"));
				groupDTO.setDescr(rs.getString("descr"));
				groupDTO.setRightList(rightList);*/
				
				RightDTO rightDTO = new RightDTO();
				rightDTO.setName(rs.getString("name"));
				rightDTO.setDescr(rs.getString("descr"));
				rightDTO.setUrl(rs.getString("screenname"));
				rightList.add(rightDTO);
				
				groupMap.put(rs.getString("groupname"), rightList);
			}
			
			if(userDTOObject!=null)
			{
				if(roleDTO!=null)
				{
					userDTOObject.setRoleDTO(roleDTO);
					if(groupMap!=null && groupMap.size()>0)
					{
						roleDTO.setGroupMap(groupMap);
						if(rightList!=null && rightList.size()>0)
						{
							
						}
					}
				}
			}
			System.out.println("DATA IS "+userDTOObject);
		}
		finally
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(pstmt!=null)
			{
				pstmt.close();
			}
			if(con!=null)
			{
				con.close();
			}
		}
		return userDTOObject;
	}
}
