<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Login 'Successfull'</h1>
<%  

String suser = (String)session.getAttribute("suser");


%>

<h2>Welcome to <%=suser  %></h2> <br>
<form action="logout">
<input type="submit" value="logout">
</form>
<br><br>
<a href="Home.jsp">Click Here to Goto to Home Page</a>
</center>
</body>
</html>