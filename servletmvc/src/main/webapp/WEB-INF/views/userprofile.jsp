<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
<spring:form>
	<table>
		<tr>
			<td>Name:</td>
            <td>${user.name}</td>
		</tr>
		<tr>
			<td>Mobile:</td>
            <td>${user.mobile}</td>
		</tr>
		<tr>
			<td>Email:</td>
            <td>${user.email}</td>
		</tr>
		<tr>
			<td>Role:</td>
            <td>${user.role}</td>
		</tr>
	</table>
</spring:form>     
       
</body>
</html>