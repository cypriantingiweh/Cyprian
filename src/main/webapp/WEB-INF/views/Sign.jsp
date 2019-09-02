<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login and Sign-Page</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
		
		
<style>
nav {
	position: absolute;
	top: 0;
	width: 100%;
	height: 60px;
	background-color: #8c8cd9;
	font-size:18px;
}
</style>
</head>

	<body>
		 <nav class="navbar navbar-default">
			
			
					<ul class="nav navbar-nav">
						<li><a href="/FrontpageServlet">Home</a></li>
						<li><a href="#">Welcome</a></li>
						<li><a href="#">Products</a></li>
						<li><a href="#">Category</a></li>
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/LoginServlet.do">Login</a></li>
							<li><a class="active" href="#">Sign-In</a></li>
					</ul>
			
				</nav>
		
	<div class="container">
		<h1>Welcome  To Enter my Shope Sign-in </h1>
		<br /><br />
		<form action="/SignInServlet.do" method="post" class = "form-group">
			
				   
					 <input type="text" name="name" class = "form-control" value = "Name">
					 <br />
					 <br />
					 <input type="text" name="username" class = "form-control"  value = "Username">
					 <br />
					 <br />
					 <input type="text" name="password" class = "form-control" value = "Password">
						<br />
		              <input class="btn btn-success" type="submit" value="sign-in">
		</form>
	</div>
</body>
</html>