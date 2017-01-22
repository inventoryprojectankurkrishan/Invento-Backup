package com.devlopnation.common.dao;

public class CommonSQL {
	public static final String USER_SQL= "select userid, password, "
	  		+ "role_master.name as rolename,role_master.descr as roledescr, "
	  		+ "right_master.name, right_master.descr, right_master.screenname from"
	  		+ " user_master, role_master, user_role_mapping urmap, right_master,"
	  		+ " role_right_mapping rrmap where userid=? and password=? "
	  		+ "and user_master.status='Y' and role_master.roleid=urmap.roleid "
	        +"  and user_master.uid = urmap.uid and"
	        + " right_master.rightid = rrmap.rightid and "
	        + "role_master.roleid=rrmap.roleid";

	public static final String REGISTER_SQL = "insert into user_master (userid, "
			+ "password,status) values (?, ?, ?)";

	public static final String USER_NAME_REGISTER_SQL ="insert into name (salutation, firstname,"
			+ "lastname) values (?,?,?) "; 
	
	public static final String USER_LOGIN_SQL = "select userid, password, salutation, firstname, "
			+ "lastname, displayname, role_master.name as rolename,role_master.descr as "
			+ "roledescr, right_master.name, right_master.descr, right_master.screenname from"
	  		+ " user_master,name,user_master_name_mapping umnmap, role_master, user_role_mapping "
	  		+ "urmap, right_master, role_right_mapping rrmap where userid=? and password=? "
	  		+ "and user_master.status='Y' and role_master.roleid=urmap.roleid "
	        +"  and user_master.uid = urmap.uid and"
	        + " right_master.rightid = rrmap.rightid and "
	        + "role_master.roleid=rrmap.roleid and user_master.uid=umnmap.uid and name.nameid = "
	        + "umnmap.nameid";

	public static final String SET_LAST_LOGIN ="update user_master set lastlogin = ? where "
			+ "userid= ?";
	
	
	


}
