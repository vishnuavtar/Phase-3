
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

List<Buy> y=(List<Buy>)request.getAttribute("list");

%>

<table border="1">
<tr><th>Buy ID</th><th>Name</th><th>Buy Address</th><th>Shoes Model</th><th>Status</th> <th>Card's Holder Name</th> <th>Total Amount</th> <th>CCV</th> <th>Size</th></tr>
<%for(Buy yy:y){ %>
<tr> <td><%=yy.getId() %></td>  <td><%=yy.getName() %></td>   <td><%=yy.getAddress()%></td><td><%=yy.getModel() %></td><td><%=yy.getStatus() %></td><td><%=yy.getCardname() %></td>  <td><%=yy.getAmmount() %></td> <td><%=yy.getCcv() %></td> <td><%=yy.getSize() %></td> </tr>

<%} %>
</table>


</center>
</body>
</html>
