<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff Management System</title>
<style type="text/css">
a{text-decoration:none;}
.button{
background-color: #eee0f5;
border-radius: 5px;
width: 90px;
height: 30px; 
font-size: 16px; 
cursor: pointer; 
color:#22170b; ; 
margin-top:10px;
display:block;
}
.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}
.button:hover{
background-color:#660000;
color:#ffffff
}
.button:active{
transform:translateY(4px);
box-shadow:0 5px #666;
}
.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 3;
  right: 0;
}
</style>
</head>
<body style="background-color: #a40606; 
background-image: linear-gradient(315deg, #a40606 0%, #d98324 74%);">
<center>
<h1>Staff Management System</h1><br><br><br>
<br><br><br><br><br>
<a href="Create.jsp"><button class="button" ><span>Create</span></button></a>
<a href="Read.jsp"><button class="button" ><span>Search</span></button></a>
<a href="Update.jsp"><button class="button" ><span>Update</span></button></a>
<a href="Delete.jsp"><button class="button" ><span>Delete</span></button></a>
<br><br><br><br><br><br><br><br>
</center>
</body>
</html>