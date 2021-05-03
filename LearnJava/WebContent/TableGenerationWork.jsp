<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table Generation</title>
</head>
<body bgcolor="#b30000" >
<center>
<br><br><br><br><br><br><br><br>
<b style="font-size:25px">
<%
String s=request.getParameter("p");
int n=Integer.parseInt(s);
for(int i=1;i<=20;i++){
	out.print(i+" * "+n+" = "+i*n);
	out.print("<br>");
}
%>
</b>
</center>
</body>
</html>