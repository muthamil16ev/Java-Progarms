<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Perfect Number</title>
</head>
<body bgcolor="#cc99ff">
<center>
<br><br><br><br><br><br><br><br>
<b style="font-size:25px">
<%
String s=request.getParameter("p");
int n=Integer.parseInt(s);
int sum=0;
for(int i=1;i<=n/2;i++){
	if(n%i==0){
		sum=sum+i;
	}
}
if(n==sum){
	out.print(n+" is a Perfect Number");
}
else{
	out.print(n+" is not a Perfect Number");
}
%>
</b>
</center>
</body>
</html>