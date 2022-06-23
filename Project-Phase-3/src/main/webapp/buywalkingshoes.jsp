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
<h2>Buy Walking Shoes</h2>
<h3>Product Details </h3>
<h3>Puma Shoes</h3>
Category - Walking shoes <br> 
Descrition - Puma Shoes <br>
Price - Rs.1000 <br>
Model No. - 2 <br> 
<img src="/shoes/walking1.jpg"/>


<form action="running">
<h3>Enter Shipping Address</h3> <br>
Enter Name <input type="text" name="name" required> <br> <br>
Address <input type="text" name="address" required> <br> <br>

Shoes Model 
<select name="model" required>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
</select> 

Status <input type="text" name="status" required>  <br> <br>
<h3>Enter Card Details</h3> <br> 
Card Holder's Name <input type="text" name="cardname" required> <br> <br>
Amount <input type="text" name="ammount" required> <br> <br>
Card Number <input type="text" name="cardnumber" required> <br> <br>
Enter CCV <input type="text" name="ccv" required> <br> <br>
Select Size<select name="size" required>
<option>5</option>
<option>6</option>
<option>7</option>
<option>8</option>
<option>9</option>
</select>
<input type="submit">
</form>
</center>
</body>
</html>