
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="com.example.demo.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food</title>
<style>
    .a1{
        width:250px;
        height:40px;
        font-size: 20px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: red;
        text-align: center;
        background-color: azure;
        text-decoration: none;
    }
    
   .a2{
        width:250px;
        height:40px;
        font-size: 18px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: black;
        text-align: center;
        background-color: azure;
        text-decoration: none;
    }
</style>
</head>
<body>
<center>
<%

List<food> f=(List<food>)request.getAttribute("list");

%>

<table border="1">
<tr><th class="a1">Food ID</th><th class="a1">Food Name</th><th class="a1">Price</th><th class="a1">Delete</th><th class="a1">Update</th></tr>
<%for(food ff:f){ %>
<tr class="a2"> <td><%=ff.getId()%></td>  <td><%=ff.getFoodname() %></td><td><%=ff.getPrice()%></td><td><a href="FoodDelete.jsp">Delete</a></td><td><a href="FoodUpdate.jsp">Update</a></td></tr>

<%} %>
</table>


</center>
</body>
</html>
