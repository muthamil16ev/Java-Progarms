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
<body  bgcolor="#2f878e">
<a href="home.jsp"> <input type="button" value="Home" class="button" ></a>
<a href="Create.jsp"><input type="button" value="back" class="button" style="float: right;"></a>
<center>
<br><br><br><br><br><br><br><br><br>  
<%
Integer id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String DateOfBirth=request.getParameter("birth");
String gender=request.getParameter("gender");
String address=request.getParameter("address");
String state=request.getParameter("state");
String country=request.getParameter("country");
String PinCode=request.getParameter("pincode");
String PhoneNumber=request.getParameter("phoneNo");
String Email=request.getParameter("mail");
String DateOfJoining=request.getParameter("dateOfJoining");
String bloodGroup=request.getParameter("bg");
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/StaffManagementdb","root","1234");
PreparedStatement ps=con.prepareStatement("insert into sms values(?,?,?,?,?,?,?,?,?,?,?,?)");
ps.setInt(1, id);
ps.setString(2, name);
ps.setString(3,DateOfBirth );
ps.setString(4, gender);
ps.setString(5, address);
ps.setString(6, state);
ps.setString(7, country);
ps.setString(8, PinCode);
ps.setString(9, PhoneNumber);
ps.setString(10, Email);
ps.setString(11, DateOfJoining);
ps.setString(12, bloodGroup);
ps.executeUpdate();
con.close();
out.println("<div style=color:white;font-size:24px >Successfully inserted Data into DB</div>");
}
catch(Exception e){
	System.out.println(e);

}
%>
</center>
</body>
</html>