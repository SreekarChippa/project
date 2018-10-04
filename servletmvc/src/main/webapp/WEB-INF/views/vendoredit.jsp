<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="contextpath.jsp" %>    
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>vendor edit</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link text-primary" href="${contextPath}/vendor/vendorpage">Back</a>
    </li>
  </ul>
</nav>
<br>
<h3>Welcome To Vendor Edit Page!</h3>
<br>

<springform:form action="vendor/vendorupdateprocess" method="post" modelAttribute="vendor">

<table>
	<tr>
		<td>Id:</td>
		<td><springform:input path="vendorId" type="hidden"/> </td>
	</tr>
	
	<tr>
		<td>Name:</td>
		<td><springform:input path="name"/> </td>
	</tr>

	<tr>
		<td>Mobile:</td>
		<td><springform:input path="mobile"/> </td>
	</tr>
	
	<tr>
		<td>Email:</td>
		<td><springform:input path="email"/></td>
	</tr>
	
	<tr>
		<td>Password:</td>
		<td><springform:input path="password" type="hidden"/> </td>
	</tr> 
	
	 <tr>
		<td>Company Name:</td>
		<td><springform:input path="companyName"/> </td>
	</tr> 
	
	<tr>
		<td><input type="submit" value="Update"> </td>
	</tr>
	
</table>

</springform:form>

</body>
</html>