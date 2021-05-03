<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Anagram</title>
</head>
<body bgcolor="#df80ff">
	<center>
	<br><br><br><br><br><br><br><br> 
<b style="font-size: 25px">
 <%
 	String s1 = request.getParameter("p");
 String s2 = request.getParameter("n");
 	char c1[]=s1.toCharArray();
 	char c2[]=s2.toCharArray();
 	if(c1.length==c2.length){
 		for(int i=0;i<c1.length;i++){
 			for(int j=i+1;j<c2.length;j++){
 				if(c1[i]>c1[j]){
 					char temp=c1[i];
 					c1[i]=c1[j];
 					c1[j]=temp;
 				}
 				if(c2[i]>c2[j]){
 					char temp=c2[i];
 					c2[i]=c2[j];
 					c2[j]=temp;
 				}
 			}
 		}
 	String x=String.valueOf(c1);
 	String y=String.valueOf(c2);
 	if(x.equals(y)){
 		out.print("Anagram");
 	}
 	else{
 		out.print("Not an Anagram");
 	}
 	}else{
 		out.print("Not an Anagram");
 	}
 %>
		</b>
	</center>
</body>
</html>