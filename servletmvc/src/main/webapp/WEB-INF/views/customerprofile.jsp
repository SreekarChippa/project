<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ include file="contextpath.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<title>Customer Profie</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link text-primary" href="${contextPath}/customer/customerpage">Back</a>
    </li>
  </ul>
</nav>
<br>
<h3>Welcome To Customer Profile Page!</h3>
<br>	
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