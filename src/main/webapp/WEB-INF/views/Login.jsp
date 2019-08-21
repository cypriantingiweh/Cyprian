<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login and Sign-Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="">Todos</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="Login.jsp">Login</a></li>
		</ul>

	</nav>

<div class="container">
<h1>WElcome  sign-in to continue </h1>

<form action="/LoginServlet.do" method="post">
    Username: <input type="text" name="username"> <br>
    Password: <input type="text" name="password"> <br>
               <input type="submit" value="Login">
</form>
 
 </div>
 
</body>
</html>