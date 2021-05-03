<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Diamond Pattern</title>
</head>
<body bgcolor="#cc99ff">
<center>
<br><br><br><br><br><br>
<b style="font-size:25px">
<%
String s=request.getParameter("p");
int n=Integer.parseInt(s);
for (int i = 1; i <= n * 2 - 1; i++) {
	if (i <= n) {
		for (int j = i; j <= n - 1; j++) {
			out.print("  ");
		}
		for (int k = 1; k <= 2 * i - 1; k++) {
			out.print("* ");
		}
	} else {
		for (int j = 1; j <= i - n; j++) {
			out.print("  ");
		}
		for (int k = i - n; k <= 2 * (n - 1) - (i - n); k++) {
			out.print("*  ");
		}
	}
	out.print("<br>");
}
%>
</b>
</center>
</body>
</html>