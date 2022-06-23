
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%

List<User> u=(List<User>)request.getAttribute("list");

%>

<table border="1">
<tr><th>User</th><th>Password</th><th>Email</th></tr>
<%for(User uu:u){ %>
<tr> <td><%=uu.getSuser() %></td>  <td><%=uu.getSpassword() %></td>   <td><%=uu.getSemail() %></td> </tr>

<%} %>
</table>


</center>
</body>
</html>
