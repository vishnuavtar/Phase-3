<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page of Users</title>
</head>
<body>
<center>
<h1>User Login Pannel</h1>
<form action="login">
Username <input type="text" name="suser" required><br> <br>
Password<input type="password" name="spassword" required><br> <br>
<input type="submit" value="login">
<a href="forgetpassword.jsp">Forget Password</a>
</form>
<h3>if login failed , register on the below link</h3>
<a href="register.jsp">register here..</a>
</center>
</body>
</html>