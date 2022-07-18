<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Food Search</title>
<style>
* {
  box-sizing: border-box;
}

#myInput {
  background-image: url('/css/searchicon.png');
  background-position: 10px 12px;
  background-repeat: no-repeat;
  width: 100%;
  font-size: 16px;
  padding: 12px 20px 12px 40px;
  border: 1px solid #ddd;
  margin-bottom: 12px;
}

#myUL {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

#myUL li a {
  border: 1px solid #ddd;
  margin-top: -1px; /* Prevent double borders */
  background-color: #f6f6f6;
  padding: 12px;
  text-decoration: none;
  font-size: 18px;
  color: black;
  display: block
}

#myUL li a:hover:not(.header) {
  background-color: #eee;
}

.s1{
position:absolute;
left:200px;
right:200px;
}

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
        font-size: 30px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        font-weight: 300;
        color: red;
        background-color: azure;
        padding: 30px;
        text-decoration: none;
    }
</style>
</style>
</head>
<body bgcolor="#EF9F87">

<div class="s1">

<h2 class="a1">All Food List For Buy</h2>

<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">

<ul id="myUL" class="a2">
  <li><a href="ShowAllFoodDirect.jsp">Pizza</a></li>
  <li><a href="ShowAllFoodDirect.jsp">Sampsa</a></li>

  <li><a href="ShowAllFoodDirect.jsp">Rice</a></li>
  <li><a href="ShowAllFoodDirect.jsp">Burger</a></li>

  <li><a href="ShowAllFoodDirect.jsp">Role</a></li>
  <li><a href="ShowAllFoodDirect.jsp">Sweetes</a></li>
  <li><a href="ShowAllFoodDirect.jsp">Bread</a></li>
</ul>

</div>

<script>
function myFunction() {
    var input, filter, ul, li, a, i, txtValue;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    ul = document.getElementById("myUL");
    li = ul.getElementsByTagName("li");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        txtValue = a.textContent || a.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";
        }
    }
}
</script>

</body>
</html>
