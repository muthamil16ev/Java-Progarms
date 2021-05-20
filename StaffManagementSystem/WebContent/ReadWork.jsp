<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff Management System</title>
<style type="text/css">
table,th,td{
border:2px solid black;
text-align:left;
cursor:pointer;
}
.table{
border-collapse:collapse;
 width:40%; 
 font-size: 20px;
}
th{
color:#660000;
}
td{
color:black;
}
th,td{
padding:5px;
}
tr:hover{
background-color:#f5f5f5;
}
th:hover{
color:black;
}
td:hover{
color:#660000;
}
.button{
background-color: #eee0f5;
 border: none;
border-radius: 5px;
width: 100px;
height: 30px; 
font-size: 16px; 
cursor: pointer; 
color:#22170b; ; 
margin-top:30px;
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
<body style="background-color: #d387ab; background-image: linear-gradient(315deg, #d387ab 0%, #b279a7 74%);">
<a href="home.jsp"> <input type="button" value="Home" class="button"></a>
<a href="Read.jsp"><input type="button" value="Back" style="float: right;" class="button"></a>
<center><br><br>
<table border="2" class="table">
<%
	int id = Integer.parseInt(request.getParameter("id"));
	try {
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StaffManagementdb", "root","1234");
		   PreparedStatement ps = con.prepareStatement("select * from sms where id = ?");
		   ps.setInt(1, id);
		   ResultSet rs = ps.executeQuery();
		   while (rs.next()) {
		  out.println("<tr><th>Staff Id</th><td>" + rs.getInt(1) + "</td></tr><tr><th>Name</th><td>" + rs.getString(2) + "</td></tr><tr><th>DateOfBirth</th><td>" + rs.getString(3)+ "</td></tr><tr><th>Gender</th><td>"
								+ rs.getString(4) + "</td></tr><tr><th>Address</th><td>"+ rs.getString(5)  + "</td></tr><tr><th>State</th><td>" + rs.getString(6)
								+ "</td></tr><tr><th>Country</th><td>" + rs.getString(7) + "</td></tr><tr><th>PinCode</th><td>" + rs.getString(8) + "</td></tr><tr><th>PhoneNumber</th><td>"
								+ rs.getString(9) + "</td></tr><tr><th>E-mail</th><td>" + rs.getString(10) + "</td></tr><tr><th>DateOfJoining</th><td>" + rs.getString(11)
								+ "</td></tr><tr><th>BloodGroup</th><td>" + rs.getString(12)+"</td></tr>");
			}
			con.close();
		 } catch (Exception e) {
					System.out.println(e);
				}
%>
</table>
<br><br><br><br>
</center>
</body>
</html>