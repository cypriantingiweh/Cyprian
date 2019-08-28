<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login and Sign-Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.container{
	Font-color:white;
}
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
			
					<a href="#">Brand</a>
			
					<ul class="nav navbar-nav">
						<li><a href="/">Home</a></li>
						<li><a href="/">Products</a></li>
						<li><a href="/">Category</a></li>
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
						<li><a class="active" href="#">Login</a></li>
							<li><a class = "nav-link" href="/SignInServlet.do">Sign-In</a></li>
					</ul>
			
				</nav>

		<div class="container">
					<h1>Welcome To The World Market </h1>
					
					<form action="/LoginServlet.do" method="post" class = "form-group">
				
					   		<input type="text" name="username"  class = "form-control"  value = " Username">
					   		<br />
					   		<input type="text" name="password" class = "form-control" value = " Password">
					    
					  <input  class="btn btn-success" type="submit" value="Login">
					</form>
		 
		 </div>
 
	</body>
</html>