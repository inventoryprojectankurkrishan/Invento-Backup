package com.devlopnation.users.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.devlopnation.common.dao.CommonDAO;
import com.devlopnation.common.dao.CommonSQL;
import com.devlopnation.users.dto.NameDTO;
import com.devlopnation.users.dto.RightDTO;
import com.devlopnation.users.dto.RoleDTO;
import com.devlopnation.users.dto.UserDTO;

public class UserDAO {
	public UserDTO isUserExist(UserDTO userDTO) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		UserDTO userDTOObject = null;
		RoleDTO roleDTO = null;
		LinkedHashMap<String, ArrayList<RightDTO>> groupMap = new LinkedHashMap<>();
		ArrayList<RightDTO> rightList = new ArrayList<RightDTO>();
		NameDTO nameDTO = null;
		try
			{	
			String tempGroupName="";
			con= CommonDAO.getConnection();
			pstmt=con.prepareStatement(CommonSQL.USER_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPassword());
			rs = pstmt.executeQuery();
			while(rs.next())
			{	
				if(rs.isFirst())
				{
					tempGroupName=rs.getString("groupname");
					if(userDTOObject==null)
					{	userDTOObject= new UserDTO();
						userDTOObject.setUserid(rs.getString("userid"));
					}
							
					if(nameDTO==null)	
					{	
						nameDTO=new NameDTO();
						nameDTO.setSalutation(rs.getString("salutation"));
						nameDTO.setFirstName(rs.getString("firstname"));
						nameDTO.setMiddlename(rs.getString("middlename"));
						nameDTO.setLastname(rs.getString("lastname"));
					}
					if(roleDTO==null)
					{
						roleDTO= new RoleDTO();
						roleDTO.setName(rs.getString("rolename"));
						roleDTO.setDescr(rs.getString("roledescr"));
					}
				}
				
				if(!(tempGroupName.equals(rs.getString("groupname"))))
				{
					groupMap.put(tempGroupName, rightList);
					rightList=new ArrayList <RightDTO>();
					tempGroupName=rs.getString("groupname");
				}
				RightDTO rightDTO = new RightDTO();
				rightDTO.setName(rs.getString("name"));
				rightDTO.setDescr(rs.getString("descr"));
				rightDTO.setUrl(rs.getString("screenname"));
				rightList.add(rightDTO);
				
				if(rs.isLast())
				{
					groupMap.put(tempGroupName, rightList);
				}
			}
			if(userDTOObject!=null)
			{
				if(roleDTO!=null)
				{
					userDTOObject.setRoleDTO(roleDTO);
					if(groupMap!=null && groupMap.size()>0)
					{
						roleDTO.setGroupMap(groupMap);
						if(nameDTO!=null)
						{
							userDTOObject.setName(nameDTO);
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
