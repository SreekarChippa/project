<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<h1>Welcome To SignUp Page!</h1>

<springform:form action="register" method="POST" modelAttribute="user">


	<springform:input path="name"/>
	<springform:input path="email"/>
	<springform:input path="mobile"/>
	<springform:input path="password"/>
	<springform:input path="confirmPassword"/>
	<springform:input path="companyName"/>
	<springform:select path="role">
		<springform:option value="vendor" label="vendor"/>
		<springform:option value="customer" label="customer"/>
	</springform:select>
	
	<input type="submit" value="submit"/>

</springform:form>

</body>
</html>