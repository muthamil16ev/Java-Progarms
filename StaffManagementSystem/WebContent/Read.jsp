<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff Management System</title>
<style type="text/css">
input{
background-color: #eee0f5; 
border: none; 
border-radius:3px; 
width: 200px; 
height: 23px; 
font-size: 14px; 
cursor: pointer; 
color:#22170b; 
margin-top:3px;
}
.button{
border-radius: 5px;
width: 100px;
height: 30px; 
font-size: 16px; 
cursor: pointer; 
color:#22170b; ; 
margin-top:20px
}
.button:hover{
background-color:#660000;
color:#ffffff
}
.button:active{
transform:translateY(4px);
box-shadow:0 5px #666;
}
</style>
</head>
<body style="background-color: #63d471;
background-image: linear-gradient(315deg, #63d471 0%, #233329 74%);
">
<a href="home.jsp"> <input type="button" class="button" value="Home"></a>
<a href="Update.jsp"><input type="button" class="button" value="Next"	style="float: right;"></a>
<center>
<br><br><br><br><br><br><br>
<form action="ReadWork.jsp" method="post">
<table>
<tr><td><input type="number" name="id" placeholder="  Enter staff id here..." required></td></tr>
<tr><td>&emsp;&emsp;&emsp;<input type="submit" value="Search" class="button"></td></tr>
</table>
</form>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</center>
</body>
</html>