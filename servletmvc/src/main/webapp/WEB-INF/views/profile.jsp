<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
<h1>User Profile</h1>

<table>
	
<%-- 	<tr>
		<td>Id</td>
		<td><springform:input path="hidden"/> </td>
	</tr> --%>
	
	<tr>
		<td>UserName:</td>
		<td>${profile.name } </td>
	</tr>

	<tr>
		<td>Email::</td>
		<td>${profile.email } </td>
	</tr>

	<tr>
		<td>Mobile:</td>
		<td>${profile.mobile } </td>
	</tr>
	
	<tr>
		<td>CompanyName:</td>
		<td>${profile.companyName } </td>
	</tr>
	
	<tr>
		<td><a href="edit" type="button">Edit</a> </td>
	</tr>
	
</table>


	
</body>
</html>