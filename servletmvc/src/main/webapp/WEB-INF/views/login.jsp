<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To Login Page!</h1>
	
<springform:form action="loginprocess" method="POST" modelAttribute="login">
		
<table>
	<tr>
		<td><springform:label path="email">Email:</springform:label></td>
		<td><springform:input path="email"/> </td>
	</tr>	
	<tr>
		<td><springform:label path="password">Password:</springform:label> </td>
		<td><springform:input path="password"/> </td>
	</tr>
	<tr>
		<td><input type="submit" value="login"> </td>
	</tr>
</table>
	
</springform:form>
	
</body>
</html>