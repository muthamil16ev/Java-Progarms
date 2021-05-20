<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff Management System</title>
<style type="text/css">
.button{
background-color: #eee0f5; 
border: none; 
border-radius: 5px;
width: 100px;
height: 30px; 
font-size: 16px; 
cursor: pointer; 
color:#22170b; ; 
margin-top:30px
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
<body style="background-color: #90d5ec;background-image: linear-gradient(315deg, #90d5ec 0%, #fc575e 74%);">
<a href="home.jsp"> <input type="button" value="Home" class="button"></a>
<a href="Update.jsp"><input type="button" value="Back" class="button" style="float: right;"></a>
<center><br><br><br><br><br><br><br><br><br><br>
<%
int id=Integer.parseInt(request.getParameter("id"));
String phoneNumber=request.getParameter("phoneNo");
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StaffManagementdb","root","1234");
	PreparedStatement ps=con.prepareStatement("update sms set PhoneNumber=? where id=?");
	ps.setString(1, phoneNumber);
	ps.setInt(2, id);
	ps.executeUpdate();
	out.println("<div style=color:white;font-size:24px >Successfully update Data into DB</div>");
	con.close();
}
catch(Exception e){
	System.out.println(e);
}
%>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	</center>
</body>
</html>