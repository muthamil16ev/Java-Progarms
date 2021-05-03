<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Compound Interest</title>
</head>
<body bgcolor="#b30000" >
<center>
<br><br><br><br><br><br><br><br><br><br>
<b style="font-size:25px">
<%
String s=request.getParameter("p");
double p=Double.parseDouble(s);
String s1=request.getParameter("n");
double n=Double.parseDouble(s1);
String s2=request.getParameter("r");
double r=Double.parseDouble(s2);
double ci=(p*Math.pow((1+r/100), n))-p;
out.print("Per month Interest "+ci);
%>
</b>
</center>
</body>
</html>