
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
<body bgcolor="#E6F9DE">
<center>
<%

List<category> c=(List<category>)request.getAttribute("list");

%>

<table border="1">
<tr><th>Category ID</th><th>Category Name</th><th>Edit</th><th>Delete</th></tr>
<%for(category cc:c){ %>
<tr> <td><%=cc.getId() %></td>  <td><%=cc.getPname() %></td> <td><a href="updateCategory.jsp">Edit</a></td><td><a href="deleteCategory.jsp">Delete</a></td> </tr>

<%} %>
</table>

<a href="addCategory.jsp">Add Another Product Category</a>
</center>
</body>
</html>
