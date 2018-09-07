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

<table>
	<tr>
      <td><springform:label path="name">Name:</springform:label></td>
      <td><springform:input path="name"/></td>
    </tr>
    <tr>
      <td><springform:label path="email">Email:</springform:label></td>
      <td><springform:input path="email"/></td>
    </tr>
    <tr>
      <td><springform:label path="mobile">Mobile:</springform:label></td>
      <td><springform:input path="mobile"/></td>
    </tr>
    <tr>
      <td><springform:label path="password">Password:</springform:label></td>
      <td><springform:input path="password"/></td>
    </tr>
    <tr>
      <td><springform:label path="confirmPassword">Confirm Password:</springform:label></td>
      <td><springform:input path="confirmPassword"/></td>
    </tr>
    <tr>
    	<td><springform:label path="companyName">Company Name:</springform:label></td>
    	<td><springform:input path="companyName"/></td>
    </tr>

	<tr>
		<td>
			<springform:select path="role">
				<springform:option value="vendor" label="vendor"/>
				<springform:option value="customer" label="customer"/>
			</springform:select>
		</td>
	</tr>
	
	<tr>
	<td><input type="submit" value="sign up"/></td>
	</tr>
	
</table>
</springform:form>

</body>
</html>