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

		<a href="#">Blank</a>

		 <ul class="nav navbar-nav">
			<li><a class="active" href="#">Home</a></li>
			<li><a href="/ProdutServlet.do">Product</a></li>
			<li><a href="#">Category</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/SignInServlet.do">Sign-In</a></li>
			<li><a href="/logout.do">LogOut</a></li>
		</ul>

	</nav>
	
		<div class="container">
			<h1>Welcome  To The Market </h1>
						<br /> 
			<a href = "/ProductServlet.do"  class="btn btn-success"> See products</a>			

	 <br />
 </div>
 
</body>
</html>