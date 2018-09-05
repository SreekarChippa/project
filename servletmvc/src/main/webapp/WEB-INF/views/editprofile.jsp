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

<springform:form action="updateprofile" method="post" modelAttribute="user">

<table>
	<tr>
		<td>Id</td>
		<td><springform:input path="userId" type="hidden"/> </td>
	</tr>
	
	<tr>
		<td>name</td>
		<td><springform:input path="name"/> </td>
	</tr>

	<tr>
		<td>Mobile</td>
		<td><springform:input path="mobile"/> </td>
	</tr>
	
	<%-- <tr>
		<td>Password</td>
		<td><springform:input path="hidden"/> </td>
	</tr> --%>
	
	 <tr>
		<td>CompanyName</td>
		<td><springform:input path="companyName"/> </td>
	</tr> 
	
	<tr>
		<td><input type="submit" value="Update"> </td>
	</tr>
	
</table>

</springform:form>

</body>
</html>