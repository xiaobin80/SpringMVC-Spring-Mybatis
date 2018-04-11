<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<!-- https://v3.bootcss.com/examples/signin/ -->
  <head>
    
    <title>Login page</title>
    
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.css"></link>
	
	<!-- Custom styles for this template -->
	<!-- https://v3.bootcss.com/examples/signin/signin.css -->
	<link rel="stylesheet" href="<c:url value='/static/css/signin.css' />"></link>
	
	<!-- Favicons -->
	<link rel="icon" href="https://v3.bootcss.com/favicon.ico">
	
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="https://v3.bootcss.com/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="https://v3.bootcss.com/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
    <div class="container">
		<c:url var="loginUrl" value="/login" />
        <form action="${loginUrl}" method="post" class="form-signin">
			<c:if test="${param.error != null}">
				<div class="alert alert-danger">
					<p>Invalid SSO-ID or password.</p>
				</div>
			</c:if>
			<c:if test="${param.logout != null}">
				<div class="alert alert-success">
					<p>You have been logged out successfully.</p>
				</div>
			</c:if>
     			<div class="input-group input-group-sm">
                    <label class="input-group-addon"><span class="fa fa-user"></span></label>
                    <input type="text" class="form-control" id="ssoId" name="ssoId" placeholder="SSO ID" required>
                </div>
				<div class="input-group input-group-sm">
					<label class="input-group-addon"><span class="fa fa-lock"></span></label>
					<input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
				</div>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					 
				<div class="form-actions">
					<input type="submit" class="btn btn-block btn-primary btn-default" value="Log in">
				</div>
        </form>
    </div>
  </body>
</html>
