package com.devlopnation.common.dao;

public class CommonSQL {
	
	/*public static final String USER_SQL= "select userid, password, "
	  		+ "role_master.name as rolename,role_master.descr as roledescr, "
	  		+ "right_master.name, right_master.descr, right_master.screenname from"
	  		+ " user_master, role_master, user_role_mapping urmap, right_master,"
	  		+ " role_right_mapping rrmap where userid=? and password=? "
	  		+ "and user_master.status='Y' and role_master.roleid=urmap.roleid "
	        +"  and user_master.uid = urmap.uid and"
	        + " right_master.rightid = rrmap.rightid and "
	        + "role_master.roleid=rrmap.roleid";*/
	
	/*public static final String USER_SQL = "select userid, password, salutation, firstname, "
			+ "lastname, displayname, role_master.name as rolename,role_master.descr as "
			+ "roledescr, right_master.name, right_master.descr, right_master.screenname from"
			+ " user_master,name,user_master_name_mapping umnmap, role_master, user_role_mapping "
			+ "urmap, right_master, role_right_mapping rrmap where userid=? and password=? "
			+ "and user_master.status='Y' and role_master.roleid=urmap.roleid "
    		+"  and user_master.uid = urmap.uid and"
    		+ " right_master.rightid = rrmap.rightid and "
    		+ "role_master.roleid=rrmap.roleid and user_master.uid=umnmap.uid and name.nameid = "
    		+ "umnmap.nameid";*/
	
	public static final String USER_SQL ="select userid, password, role_master.name as rolename,"
			+ "role_master.descr as roledescr,group_master.group_name as groupname,"
			+ " group_master.group_descr as groupdescr, right_master.name, right_master.descr, "
			+ "right_master.screenname from user_master, role_master, user_role_mapping urmap,"
			+ "group_master,role_group_mapping rgmap, right_master, group_right_mapping grmap"
			+ " where userid=? and password=? and user_master.status='Y' and"
			+ " role_master.roleid=urmap.roleid and user_master.uid = urmap.uid and"
			+ " role_master.roleid=rgmap.roleid and group_master.groupid=rgmap.groupid and "
			+ "right_master.rightid = grmap.rightid and group_master.groupid=grmap.groupid";
			
	public static final String SET_LAST_LOGIN ="update user_master set lastlogin = ? where "
			+ "userid= ?";
	
	public static final String REGISTER_USER_SQL = "insert into user_master (userid, "
			+ "password,status) values (?, ?, ?)";

	public static final String REGISTER_USER_NAME_SQL ="insert into name (salutation, firstname,"
			+ "lastname) values (?,?,?) "; 
	
	public static final String GET_USER_ID_AND_NAME_ID = "select uid, nameid from user_master, name,"
			+ "where user_master.userid= ? and";
	
	public static final String SET_USER_MASTER_NAME_MAPPING_TABLE = "insert into"
			+ " user_master_mapping values(?,?)";

	
}
