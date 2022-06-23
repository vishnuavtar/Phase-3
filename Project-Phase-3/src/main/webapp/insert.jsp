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
<h1>Add Product For Customers</h1>
<form action="insert">
Product name <input type="text" name="name" required> <br><br>
Product Price <input type="text" name="price" required>  <br><br>

Product Model <input type="text" name="model" required> <br><br>
Product Category
<select name="category">
<option>Running Shoes</option>
<option>Walking Shoes</option>
<option>Gym Shoes</option>
<option>Stylish </option>

</select>
 <br><br>
<input type="submit">

</form>
</center>
</body>
</html>