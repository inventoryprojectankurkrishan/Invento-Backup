<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="customCss/register.css">
<title>Register | Invento</title>
<style>
.center{
margin:auto;
}
</style>
</head>
<body>
<br>
		    <div class="container">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form method="POST" action="login" >
						<div class="form-group">
							<a href="index.jsp"><img class="img-responsive center" src="img/logo/logo_black.png" alt="invento"></a>
						</div>
						<div class="form-group">
							<h2>Create account</h2>
						</div>
						<div class="form-group">
							<label class="control-label" for="signupName">Your name</label>
							<s:textfield name="username" placeholder="Name" maxlength="50" cssClass="form-control input-lg" required="" />
						</div>
						<div class="form-group">
							<label class="control-label" for="signupEmail">Email</label>
							<input id="signupEmail" type="email" maxlength="50" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="signupUsername">Username</label>
							<s:textfield name="userid" placeholder="Username" maxlength="50" cssClass="form-control input-lg" required="" />
						</div>
						<div class="form-group">
							<label class="control-label" for="signupPassword">Password</label>
							<s:textfield name="password" placeholder="at least 6 characters" maxlength="50" cssClass="form-control input-lg" required="" />
						</div>
						<div class="form-group">
							<label class="control-label" for="signupPasswordagain">Password again</label>
							<input id="signupPasswordagain" type="password" maxlength="25" class="form-control">
						</div>
						<div class="form-group">
							<s:submit id="register" type="submit" class="btn btn-info btn-block">Create your account</s:submit>
						</div>
						<p class="form-group">By creating an account, you agree to our <a href="#">Terms of Use</a> and our <a href="#">Privacy Policy</a>.</p>
						<hr>
						<p>Already have an account? <a href="login.jsp">Sign in</a></p>
					</form>
				</div>
			</div>
		</div>
	</div>
		

</body>
</html>