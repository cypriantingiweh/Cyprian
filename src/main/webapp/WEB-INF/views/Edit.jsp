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
			
					<a href="#">Brand</a>
			
					<ul class="nav navbar-nav">
						<li><a href="#">Home</a></li>
						<li class="navbar-brand"><a  class="active" href="/ProductServlet.do">Products</a></li>
						<li><a href="#">Category</a></li>
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
						<li><a  class = "nav-link" href="/logout.do">LogOut</a></li>
							<li><href="/SignInServlet.do">Sign-In</a></li>
					</ul>
			
				</nav>
		
	<div class="container">
		<h3>Edit product description and category </h3>
		<br /><br />
		<form action="/EditServlet.do" method="post" class = "form-group">
						
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
					
		              <input class="btn btn-success" type="submit" value="Edit">
		</form>
	</div>
</body>
</html>