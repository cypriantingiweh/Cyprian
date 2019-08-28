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
						<li><a href="#">Home</a></li>
						<li class="navbar-brand"><a href="/ProductServlet">Products</a></li>
						<li><a href="#">Category</a></li>
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/LoginServlet.do">Login</a></li>
							<li><a href="/SignInServlet.do">Sign-In</a></li>
					</ul>
			
				</nav>
		
	<div class="container">
		<h3>Enter product description and category </h3>
		<br /><br />
		<form  method="post" class = "form-group" action="/Addproducts.do" enctype="multipart/form-data">
				Pid
				    <input type="text" name="Pid" class = "form-control" value = "" size="50">
				     <br />
					 <br />
				  Product Description
					 <input type="text" name="PName" class = "form-control" value = ""size="50">
					 <br />
					 <br />
				 Product Category
					 <input type="text" name="PCategory" class = "form-control"  value = "" size="50">
					 <br />
					 <input type="file" name="photo" size="10"/>
		              <input class="btn btn-success" type="submit" value="Add">
		</form>
		
	</div>
</body>
</html>