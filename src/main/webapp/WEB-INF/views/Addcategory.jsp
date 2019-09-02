<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login and Sign-Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
						<li><a href="/WelcomeServlet">Welcome</a></li>
						<li class="navbar-brand"><a href="/ProductServlet">Products</a></li>
						<li><a href="#">Category</a></li>
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/LoginServlet.do">Login</a></li>
							<li><a href="/SignInServlet.do">Sign-In</a></li>
					</ul>
			
				</nav>
		
	<div class="container">
		<h3>Enter Category Id and Name </h3>
		<br /><br />
		<form  method="post" class = "form-group" action="/Addcategory.do" >
				Category Id
				    <input type="text" name="Cid" class = "form-control" value = "" size="50">
				     <br />
					 <br />
				  Product Category Name
					 <input type="text" name="CName" class = "form-control" value = ""size="50">
					 <br />
					 <br />
		              <input class="btn btn-success" type="submit" value="Add-Category">
		</form>
		
	</div>
</body>
</html>