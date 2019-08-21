<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login and Sign-Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>

</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="">Product</a></li>
			<li><a href="">Category</a></li>
			
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><form action="/LoginServlet.do" method ="post">
			<input type = "submit" value = "Login">
			
			</form> </li>
			<li><a class = "nav-link" href="">LogOut</a></li>
		</ul>

	</nav>
	
<div class="container">
<h1>Welcome  To My Website </h1>

		<br /> To Continue 
		
	
		<form action="/SignInServlet.do" method ="post" >
			<input type="submit" value="Sign-in">
		</form>

	 <br />
 </div>
 
</body>
</html>