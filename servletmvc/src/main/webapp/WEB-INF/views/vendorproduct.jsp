<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@include file="contextpath.jsp"%>
<spring:url value="/resources/images/" var="images"></spring:url>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<p>vendor</p>
	<div class="container" style="margin-top: 30px">
		<div class="row">

			<c:forEach items="${productList}" var="product">

				<div class="card" style="width: 15rem">
					<img class="card-img-top"
						src="<spring:url value="/resources/images/products/${product.productId}.jpg"></spring:url>"
						alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title">${product.brand }</h5>
						<h5 class="card-title">${product.price }</h5>
						<a
							href="${contextPath}/vendor/viewproductspecifications/${product.productId}"><button
								class="btn btn-success">View</button></a> <a
							href="${contextPath}/vendor/editproductspecifications/${product.productId}"><button
								class="btn btn-danger">Edit</button></a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div> 

</body>
</html>