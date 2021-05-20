<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff Management System</title>
<style type="text/css">
input,select{
background-color: #eee0f5; 
border: none; 
border-radius:3px; 
width: 200px; 
height: 20px; 
font-size: 14px; 
cursor: pointer; 
color:#22170b; 
margin-top:3px;
}
.button{
border-radius: 5px;
width: 90px;
height: 30px; 
font-size: 16px; 
cursor: pointer; 
color:#22170b; ; 
margin-top:25px;
}
.button:hover{
background-color: #660000;
color:#ffffff
}
.button:active{
transform:translateY(4px);
box-shadow:0 5px #666;
}
</style>
</head>
<body bgcolor="#2f878e">
<a href="home.jsp"> <input type="button" class="button" value="Home"></a>
<a href="Read.jsp"><input type="button" class="button" value="Next" style="float: right;"></a>
<center>
<br><br>
<form action="CreateWork.jsp" method="post">
<table>
<tr><th>Staff Id :</th><td> <input type = "number" name = "id" autocomplete="off" required></td></tr>
<tr><th>Name :</th><td> <input type = "text" name = "name" required autocomplete="off"></td></tr>
<tr><th>Date of Birth :</th><td> <input type = "date" name = "birth" required></td></tr>
<tr><th>Gender :</th><td><select name="gender" class="custom-select">
<option > Male </option>
<option> Female </option>
<option> others </option>
</select></td></tr>
<tr><th>Address :</th><td> <input type = "text" name = "address" rows="3" required autocomplete="off"></td></tr>
<tr><th>State :</th><td> <input type = "text" name = "state" autocomplete="off"></td></tr>
<tr><th>Country :</th><td> <input type = "text" name = "country" autocomplete="off"></td></tr>
<tr><th>PinCode :</th><td> <input type = "text" name = "pincode" autocomplete="off"></td></tr>
<tr><th>Phone Number :</th><td> <input type = "text" name = "phoneNo" required autocomplete="off"></td></tr>
<tr><th>E-mail:</th><td> <input type = "email" name = "mail" required autocomplete="off"></td></tr>
<tr><th>Date of Joining :</th><td> <input type = "date" name = "dateOfJoining"></td></tr>
<tr><th>Blood Group :</th><td> <input type = "text" name = "bg" autocomplete="off"></td></tr>
<tr><th></th><td>&ensp;<input type = "submit"  value="Create" class="button">&ensp;<input type = "reset"  value="reset" class="button"></td></tr>
</table>
</form>
</center>
</body>
</html>