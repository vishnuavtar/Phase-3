<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Food</title>
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

    .a2{
        position: absolute;
        width: 600px;;
        top: 380px;
        left:383px;
        font-size: 30px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: red;
        text-align: center;
        background-color: azure;
        padding: 30px;
        text-decoration: none;
    }
</style>
</head>
<body bgcolor="#EF9F87">
<h1 class="a1">Add Food in Your Database for Customers</h1>
<center>
<form action="addfood">
<table>
<tr><td class="a1">Food Name </td><td><input type="text" name="foodname" class="a1" required></td></tr> <br>
<tr><td class="a1">Price</td><td> <input type="text" name="price" class="a1" required></td></tr> <br>
<input type="submit" value="Add Food" class="a2">
</table>
</form>
</center>
</body>
</html>