<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
    .a1{
        font-size: 30px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: red;
        text-align: center;
        background-color: azure;
        padding: 30px;
        text-decoration: none;
    }

    .a2{
        font-size: 20px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: red;
        text-align: center;
        background-color: azure;
        padding: 20px;
        text-decoration: none;
    }

    .a3{
        width: 470px;
        left:0px;
        position: absolute;
        top: 400px;
        font-size: 20px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: red;
        text-align: center;
        background-color: azure;
        padding: 20px;
        text-decoration: none;
    }


    .d1{
        position: absolute;
       left: 430px;
       top: 110px;
       
    }
</style>
<body bgcolor="#EF9F87">

<h2 class="a1"> Update Your Food </h2>
<div class="d1">
<form action="UpdateFood" class="a1">
<table>
<tr><td><label class="a2">ID</label> </td><td><input type="text" name="id" class="a2"></td> </tr><br>
<tr><td><label class="a2">Food Name</label> </td><td> <input type="text" name="foodname" class="a2"></td></tr> <br>
<tr><td><label class="a2">Price</label></td><td><input type="text" name="price" class="a2"> </td></tr><br>
<input type="submit" value="Update-Food" class="a3">
</table>

</form>
</div>
</body>
</html>