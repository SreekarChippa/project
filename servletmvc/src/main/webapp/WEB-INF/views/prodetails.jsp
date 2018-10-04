<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@include file="contextpath.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
	<div class="row">
		<c:forEach items="${productList}" var="product">
			<div class="col-md-4">
				<div class="thumbnail">
					<a href="#"> <img src="<spring:url  value="/resources/images/products/${product.productId}.jpg"></spring:url>" alt="${product.brand}"
							style="width: 100%">
						</a>
					<div class="caption">
						<a href="${contextPath}/vendor/viewproductspecifications/${product.productId}"><button class="btn btn-primary">view</button></a>
						<a href="${contextPath}/vendor/editproductspecifications/${product.productId}"><button class="btn btn-primary">Edit</button></a>
					</div>
				</div>
			</div>
		</c:forEach>
</div>

</body>
</html>