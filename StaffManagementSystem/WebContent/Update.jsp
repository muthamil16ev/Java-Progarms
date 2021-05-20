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
margin-top:25px
}
.button:hover{
background-color: #a0a6b0;
}
.button:active{
background-color: #a0a6b0;
transform:translateY(4px);
box-shadow:0 5px #666;
}
</style>
</head>
<body style="background-color: #90d5ec; background-image: linear-gradient(315deg, #90d5ec 0%, #fc575e 74%);">
<a href="home.jsp"> <input type="button" class="button" value="Home"></a>
<a href="Delete.jsp"><input type="button" class="button" value="Next"	style="float: right;"></a>
<center><br><br><br><br><br><br><br><br>
<form action="UpdateWork.jsp" method="post">
<table>
<tr><th>Staff Id :</th> <td><input type="number" name="id" required></td></tr>
<tr><th>Phone Number :</th> <td> <input type="text" name="phoneNo"></td></tr>
<tr><th></th><td>&emsp;&emsp;&emsp;<input type="submit" value="Update" class="button"></td></tr>
</table>
</form>
<br><br><br><br><br><br><br><br><br><br><br>
</center>
</body>
</html>