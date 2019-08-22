<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
				
				<h1>Products And Their Category  </h1>
				
				<table  class = "table table-striped">
				<tr>
				<th><b>P_ID</b></th>
				<th>Product Description</th>
				<th>Product Category</th>
				<th>EditAction</th>
				<th>DeleteAction</th>
				</tr>
						
		<c:forEach items="${data}" var="data">
				<tr>
					<td>${data.getPid()}</td>
					<td>${data.getPname()}</td>
					<td>${data.getPcategory()}</td>
					<td><a class="btn btn-succes" href="">Edit</a></td>
					<td><a class="btn btn-danger" href="">Delete</a></td>
				</tr>
			</c:forEach>		
		</table>
	</div>
</body>
</html>
			
			
			
			
		