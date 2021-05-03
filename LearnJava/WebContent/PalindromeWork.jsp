<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Palindrome</title>
</head>
<body bgcolor="#ff9933">
	<center>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br> <b style="font-size: 25px"> <%
 	String s = request.getParameter("p");
 	int n = Integer.parseInt(s);
 	int copy=n;
 	int r = 0;
 	while (n != 0) {
 		r = r * 10 + n % 10;
 		n = n / 10;
 	}
 	if (copy == r) {
 		out.print(copy + " is a palindrome");
 	} else {
 		out.print(copy + " is not a palindrome");
 	}
 %>
		</b>
	</center>
</body>
</html>