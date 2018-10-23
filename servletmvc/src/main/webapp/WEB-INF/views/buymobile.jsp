<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@include file="contextpath.jsp"%>


<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<style type="text/css">
.body {
	display: flex;
}
.body table {
	margin: 30px;
}
.body .form {
	margin: 20px;
}
</style>

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
	
	<div class="body">
		<div style="flex: 2">
			<img alt="image" style="width: 250px"
				src='<spring:url value="/resources/images/products/${mobile.productId }.jpg"></spring:url>'>
		</div>
		<table>
			<tbody>

				<tr>
					<td>Brand:</td>
					<td>${mobile.brand}</td>
				</tr>
				<tr>
					<td>Model:</td>
					<td>${mobile.model }</td>
				</tr>
				<tr>
					<td>Ram:</td>
					<td>${mobile.mobileRam}</td>
				</tr>
				<tr>
					<td>Rom:</td>
					<td>${mobile.mobileRom }</td>
				</tr>
				<tr>
					<td>Processor:</td>
					<td>${mobile.processor }</td>
				</tr>
				<tr>
					<td>Price:</td>
					<td>${mobile.price }</td>
				</tr>


			</tbody>
		</table>

		<form action="${contextPath }/customer/addtocart" method="get">
			<table>
				<tbody>
					<tr>
						<td>Product Id</td>
						<td><input type="hidden" name="productId"
							value="${mobile.productId }" /></td>
					</tr>
					<tr>
						<td>Enter number of products</td>
						<td><input type="number" name="numberOfProducts"></td>
					</tr>

					<tr>
						<td><input type="submit" value="Buy now"></td>
					</tr>
				</tbody>
			</table>
		</form>

	</div>
	<%@include file="footer.jsp"%>
</body>
</html>