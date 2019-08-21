<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login and Sign-Page</title>
</head>
<body>

<h1>Welcome  sign-in to continue </h1>

<form action="/SignInServlet.do" method="post">
	 Name: <input type="text" name="name"> <br>
    Username: <input type="text" name="username"> <br>
    Password: <input type="text" name="password"> <br>
               <input type="submit" value="sign-in">
</form>
</body>
</html>