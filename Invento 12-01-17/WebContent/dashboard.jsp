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
<script type="text/javascript" src="js/jQuery-v2.2.4.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<title>Dashboard | Invento</title>
</head>
<body>
<s:iterator value="userDTOObject" var="obj">
<div class="container">
    
    <div class="row">
    <s:iterator value="roleDTO" var="roleObj">
			<s:set id="contextPath"  value="#request.get('javax.servlet.forward.context_path')" />
        <div class="col-sm-3 col-md-3">
            <div class="panel-group" id="accordion">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h4 class="panel-title">
                        	<a href="#" class="btn btn-info btn-block" role="button">Dashboard</a>
                        </h4>
                    </div>
                <s:iterator value="groupMap" var ="groupObj">
                    <div class="panel-heading">
                        <h4 class="panel-title">
							<a data-toggle="collapse" class="btn btn-info btn-block" data-parent="#accordion" href="#${key}" >
                            </span><s:property value="key"></s:property></a>
                        </h4>
                    </div>
                    <div id="${key}" class="panel-collapse collapse">
                        <div class="panel-body">
                            <table class="table">
                            <s:iterator value="value" var="rightList">
                                <tr>
                                    <td>
                                        <s:a href="%{contextPath}%{url}">${rightList.name } </s:a>
                                    </td>
                                </tr>
                            </s:iterator>
                            </table>
                        </div>
                    </div>
                  </s:iterator>
                </div>
            </div>
       
        </div>
        </s:iterator>
        <div class="col-sm-9 col-md-9">
            <div class="well">
                <h1>
                    Accordion Menu With Icon</h1>
                Admin Dashboard Accordion Menu
            </div>
        </div>
    </div>
</div>

</s:iterator>

<%-- <s:iterator value="userDTOObject" var="obj">
<s:property value="userDTOObject"/>
			UserName :	<a>${obj.userid}</a>
	<br>
	<s:iterator value="roleDTO" var="roleObj">
			<s:set id="contextPath"  value="#request.get('javax.servlet.forward.context_path')" />
			<s:iterator value="groupMap" var ="groupObj">
			<!-- href="%{contextPath}%{url}" -->
				Groups : <s:a >${groupObj.get("groupname")}</s:a> <s:property value="key"></s:property> 
				<s:iterator value="value" var="rightList">
				Rights : <s:property value="value"></s:property> <s:a href="%{contextPath}%{url}">${rightList.name } </s:a>
				</s:iterator>
			</s:iterator>				
		</s:iterator>	
</s:iterator>


		<div >
            this is a div
		</div> --%>
</body>
</html>