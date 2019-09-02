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
						<li><a href="/WelcomeServlet">Welcome</a></li>
						<li><a  class="active" href="/ProductServlet.do">Products</a></li>
						<li><a href="#">Category</a></li>
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
						<li><a  class = "nav-link" href="/logout.do">LogOut</a></li>
							<li><a href="/SignInServlet.do">Sign-In</a></li>
					</ul>
			
				</nav>
		
	<div class="container">
		<h3>Edit product description and category </h3>
		<br /><br />
		<form action="/EditServlet.do" method="post" class = "form-group" enctype="multipart/form-data">
						
				Pid
					<input type="text" name="Pid" class = "form-control" value = "<%=request.getAttribute("P-id") %>">
					<br/>
					<br/>
				   Product Description
			
					<input type="text" name="PName" class = "form-control" value = "<%=request.getAttribute("P-Name") %>">
					 <br />
					 
					 <br />
					 Product Category
					 <input type="text" name="PCategory" class = "form-control"  value = "<%=request.getAttribute("P-Category") %>">
					 <br />
					 <br />
					  Change Picture
					  <br />
					  <img src="data:image/jpg;Base64,${Image}" width="40" height="50"/>
					<input type="file" name="photo" size="10" >
					<br />
		              <input class="btn btn-success" type="submit" value="Edit">
		</form>
	</div>
</body>
</html>