package com.devlopnation.common.dao;

public class CommonSQL {
	
/*	public static final String USER_SQL="select userid, password,"
			+ " role_master.name as rolename,role_master.descr as roledescr,"
			+ "group_master.group_name as groupname"
			+ ", right_master.name, right_master.descr, right_master.screenname from user_master,"
			+ " role_master, user_role_mapping urmap,group_master,role_group_mapping rgmap,"
			+ " right_master, group_right_mapping grmap where userid=? and password=? and"
			+ " user_master.status='Y' and role_master.roleid=urmap.roleid and"
			+ " user_master.uid = urmap.uid and role_master.roleid=rgmap.roleid and "
			+ "group_master.groupid=rgmap.groupid and right_master.rightid = grmap.rightid"
			+ " and group_master.groupid=grmap.groupid";
*/	
	public static final String USER_SQL="select userid, password, salutation, firstname, middlename,"
			+ " lastname, role_master.name as rolename,role_master.descr as roledescr,"
			+ "group_master.group_name as groupname"
			+ ", right_master.name, right_master.descr, right_master.screenname from user_master,"
			+ " name, user_master_name_mapping ummap, role_master, user_role_mapping urmap,group_master,"
			+ "role_group_mapping rgmap,"
			+ " right_master, group_right_mapping grmap where userid=? and password=? and"
			+ " user_master.status='Y' and user_master.uid=ummap.uid and "
			+ "name.nameid = ummap.nameid and role_master.roleid=urmap.roleid and"
			+ " user_master.uid = urmap.uid and role_master.roleid=rgmap.roleid and "
			+ "group_master.groupid=rgmap.groupid and right_master.rightid = grmap.rightid"
			+ " and group_master.groupid=grmap.groupid";
	
	public static final String SET_LAST_LOGIN ="update user_master set lastlogin = ? where "
			+ "userid= ?";
	
	public static final String REGISTER_USER_SQL = "insert into user_master (userid, "
			+ "password,status) values (?, ?, ?)";

	public static final String REGISTER_USER_NAME_SQL ="insert into name (salutation, firstname,"
			+ "lastname) values (?,?,?) "; 

	public static final String GET_USER_ID = "select uid from user_master "
			+ "where userid= ?";
	
	public static final String GET_USER_NAME ="select nameid from name order by nameid DESC limit 1";
	
	public static final String SET_USER_MASTER_NAME_MAPPING_TABLE = "insert into"
			+ " user_master_mapping values(?,?)";

	
}
