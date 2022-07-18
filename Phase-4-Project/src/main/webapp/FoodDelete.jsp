<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Food Delete</title>
<style>
    .a1{
        font-size: 30px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: red;
        text-align: center;
        background-color: azure;
        padding: 20px;
        text-decoration: none;
    }
</style>
</head>
<body bgcolor="#EF9F87">
<form action="deletefood" align="center">
<h2 class="a1">Enter Food Id For Delete</h2>
<input type="text" name="id" class="a1">
<input type="submit" value="Delete Food" class="a1">
</form>
</body>
</html>