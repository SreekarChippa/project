<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
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
				<td>${customerDetails.name}</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td>${customerDetails.mobile}</td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td>${customerDetails.email}</td>
			</tr>

		</table>


	</spring:form>
</body>
</html>