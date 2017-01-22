<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="customCss/login.css">

<title>Login | Invento</title>
</head>
<body>

		<div class="container">
  
  <div class="row" id="pwd-container">
    <div class="col-md-4"></div>
    
    <div class="col-md-4">
      <section class="login-form">
        <form method="post" action="dashboard" role="login">
          <a href="index.jsp"><img src="img/logo/logo_black.png" class="img-responsive" alt="" /></a>
          <br>
          <s:property value="message"></s:property>
          <!-- <input type="email" name="email" placeholder="Email" required class="form-control input-lg" value="joestudent@gmail.com" /> -->
          
          <!-- <input type="password" class="form-control input-lg" id="password" placeholder="Password" required="" /> -->
          	<s:textfield name="userid" placeholder="Username" cssClass="form-control input-lg" required="" />
			<s:password name="password" placeholder="Password" cssClass="form-control input-lg" required="" />
          
          
          <s:submit cssClass="btn btn-lg btn-primary btn-block" value="login"></s:submit>
          <!-- <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">Sign in</button> -->
          <div>
            <s:a href="register.jsp">Create Account</s:a> or <s:a href="forgetPassword.jsp">Forget Password</s:a>
          </div>
          
        </form>
      </section>  
      </div>
      
      <div class="col-md-4"></div>
      

  </div>     
</div>

</body>
</html>