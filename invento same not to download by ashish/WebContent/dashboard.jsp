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
<%-- <s:property value="userDTOObject"/></h1> --%>
	<nav class="navbar navbar-default navbar-static-top">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">
				INVENTO
			</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">			
			<form class="navbar-form navbar-left" method="GET" role="search">
				<div class="form-group">
					<input type="text" name="q" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a>${obj.userid}</a></li>
				<li class="dropdown ">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
						Account
						<span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li class="dropdown-header">SETTINGS</li>
							<li class=""><a href="#">Other Link</a></li>
							<li class=""><a href="#">Other Link</a></li>
							<li class=""><a href="#">Other Link</a></li>
							<li class="divider"></li>
							<li><a href="#">Logout</a></li>
						</ul>
					</li>
				</ul>
			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
	</nav>
		        
		        


			<%-- <s:iterator value="roleDTO" var="roleObj">
			${roleObj.name }			
			<s:set id="contextPath"  value="#request.get('javax.servlet.forward.context_path')" />
			<s:iterator value="rightList" var ="rightObj">
			
				
				<s:a href="%{contextPath}%{url}">${rightObj.name }</s:a>
			
				
				</s:iterator>
				
			</s:iterator> --%>


<div class="container-fluid main-container">
	<s:iterator value="roleDTO" var="roleObj">
			<%-- ${roleObj.name } --%>			
			<s:set id="contextPath"  value="#request.get('javax.servlet.forward.context_path')" />
			
		<div class="col-md-2 sidebar">
			<s:iterator value="rightList" var ="rightObj">
			<ul class="nav nav-pills nav-stacked">
				<li><s:a href="%{contextPath}%{url}">${rightObj.name }</s:a></li>
			</ul>
			</s:iterator>
		</div>
		
		<div class="col-md-10 content">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Dashboard
                </div>
                <div class="panel-body">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
    			    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
				cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
				proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </div>
            </div>
		</div>
		
				
		</s:iterator>	
		<footer class="pull-left footer">
			<p class="col-md-12">
				<hr class="divider">
				Copyright &COPY; 2015 <a>Invento</a>
			</p>
		</footer>
		
	</div>
</s:iterator>

</body>
</html>