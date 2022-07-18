<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy</title>
<style>
    .a1{
        font-size: 20px;
        color: #A32A06;
        font-weight: bold;
    }

    h2{
        font-size: 25px;
        background-color: #77F5D0;
        padding: 20px;
        text-align: center;
        color: red;
        font-weight: 300;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    }
</style>
<link rel="stylesheet" href=
"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity=
"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"  crossorigin="anonymous">
</head>
<body bgcolor="#CCF6BE">

<h2>Enter Field Carefully...If Your Food out of the list then they cancel automatically</h2>
<form action="addbuy">
<table class="a1" align="center">
<tr><td><label>Your Name</label></td><td> <input type="text" name="name" value="Xyz" required class="a1"></td></tr> <br>
<tr><td><label>Food Name</label></td><td> <input type="text" name="foodname" value="Pizza" required class="a1"></td></tr> <br>
<tr><td><label>Price</label></td><td>  <input type="text" name="price" value="Rs.200" required class="a1"></td></tr> <br>
<tr><td><label>Card Holder's Name</label></td><td>  <input type="text" name="cname" placeholder="Enter Card Holder Name" required class="a1"></td></tr> <br>
<tr><td><label>Card Number </label></td><td>  <input type="text" name="cardnumber" required class="a1" placeholder="Enter card number"></td></tr> <br>
<tr><td><label>Address</label></td><td>  <textarea name="address" width="500" height="2o0" placeholder="Please Enter Correct Adrress" required class="a1"></textarea> </td></tr>
<tr><td><input type="submit" value="Submit"  class="btn btn-primary btn-lg"></td></tr>
</table>
</form>

</body>
</html>