<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="customCss/app.css">
<title>Dashboard | Invento</title>
</head>
<body>
<s:iterator value="userDTOObject" var="obj">
<%-- <s:property value="userDTOObject"/> --%>
			UserName :	<a>${obj.userid}</a>
	<br>
	<s:iterator value="roleDTO" var="roleObj">
			<s:set id="contextPath"  value="#request.get('javax.servlet.forward.context_path')" />
			<s:iterator value="groupMap" var ="groupObj">
			<!-- href="%{contextPath}%{url}" -->
				Groups : <%-- <s:a >${groupObj.get("groupname")}</s:a> --%> <s:property value="key"></s:property> 
				<s:iterator value="value" var="rightList">
				<br>
				Rights : <%-- <s:property value="value"></s:property> --%> <s:a href="%{contextPath}%{url}">${rightList.name } </s:a>
				</s:iterator>
				<br>
			</s:iterator>				
		</s:iterator>	
</s:iterator>
		<div >
            this is a div
		</div>
</body>
</html>