<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prime Number</title>
</head>
<body bgcolor="#ff809f">
<center>
<br><br><br><br><br><br><br><br>
<b style="font-size:25px">
<%
String N=request.getParameter("p");
int n=Integer.parseInt(N);
int count=0;
for(int i=1;i<=n;i++){
	if(n%i==0){
		count=count+1;
	}
}
if(count==2){
	out.print(n+" is a Prime Number");
}
else{
	out.print(n+" is not a Prime Number");
}
%>
</b>
</center>
</body>
</html>