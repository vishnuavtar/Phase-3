
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

List<product> p=(List<product>)request.getAttribute("list");

%>

<table border="1">
<tr><th>Product ID</th><th>product Name</th><th>Product Price</th><th>Category</th><th>Product model</th></tr>
<%for(product pp:p){ %>
<tr> <td><%=pp.getId() %></td>  <td><%=pp.getName() %></td>   <td><%=pp.getPrice() %></td><td><%=pp.getCategory() %></td><td><%=pp.getModel() %></td> </tr>

<%} %>
</table>

<a href="insert.jsp">Add Another Product</a>
</center>
</body>
</html>
