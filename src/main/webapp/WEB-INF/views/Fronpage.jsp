<%@page import="java.io.OutputStream"%>
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
nav {
	position: absolute;
	bottom: 0;
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
					    <li><a class =  "active" href="/FrontpageServlet">Home</a></li>
						<li><a href="#">Welcome</a></li>
						<li><a href="#">Products</a></li>
						<li><a href="#">Category</a></li>
					</ul>
			
					<ul class="nav navbar-nav navbar-right">
						<li><a href="/LoginServlet.do">Login</a></li>
						<li><a href="/SignInServlet.do">Sign-In</a></li>
					</ul>
			
				</nav>

		<div class="container">
				
				<h1> Welcome to my website. </h1>
			</div>	
		<div class="container">	
		<table>
		
		  <c:forEach items="${prod}" var="prod">
				
				<tr>
				<td>
				<img src="data:image/jpg;Base64,${prod.getBaseimg()}" width="170" height="160"/><br>
				Product-ID:	${prod.getPid()}<br>
				Product Name:${prod.getPname()}<br>
				Product Category: ${prod.getPcategory()}<br>
				</td>
				
				</tr>
				
				
			</c:forEach>
			
		</table>		
	</div>
</body>
</html>
			
			
			
			
		