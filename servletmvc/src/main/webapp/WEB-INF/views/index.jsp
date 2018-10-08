<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:url value="/resources/images" var="images">
</spring:url>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ecommerce</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	
<!-- 	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" 
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous"> -->

</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<div class="navbar navbar-collapse justify-content-left">
		<a class="navbar-brand text-warning" href="">Ecommerce</a>
	</div>
	<div class="navbar-navbar justify-content-end">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="">HOME</a></li>
			<li class="nav-item"><a class="nav-link" href="#">ABOUT US</a></li>
			<li class="nav-item"><a class="nav-link" href="#">CONTACT US</a>
			</li>
			<li class="nav-item"><a class="nav-link disabled"
				href="adminlogin">ADMIN</a></li>
		</ul>
	</div>
	</nav>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<div class="dropdown collapse navbar-collapse justify-content-left">
		<button type="button" class="btn btn-dark dropdown-toggle"
			data-toggle="dropdown">Vendor</button>
		<div class="dropdown-menu">
			<a class="dropdown-item" href="vendorsignup">Sign Up</a>     
			<a class="dropdown-item" href="vendorlogin">Login</a>
		</div>
	</div>

	<div class="dropdown collapse navbar-collapse justify-content-end">
		<button type="button" class="btn btn-dark dropdown-toggle"
			data-toggle="dropdown">Customer</button>
		<div class="dropdown-menu">
			<a class="dropdown-item" href="customersignup">Sign Up</a>                                                
			<a	class="dropdown-item" href="customerlogin">Login</a>
		</div>
	</div>
	</nav> 
<br>
	<nav
		class="navbar navbar-expand-sm bg-light navbar-light justify-content-center">
	<form class="form-inline" action="/action_page.php">
		<input class="form-control mr-sm-2" type="text" placeholder="Search">
		<button class="btn btn-success" type="submit">Search</button>
	</form>
	</nav>

	<nav class="navbar navbar-expand-sm bg-light justify-content-center">
	<ul class="navbar-nav">
		
		
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> Electronics </a>
			<div class="dropdown-menu">
				<c:forEach items="${electronics}" var="electronic">
					<a class="dropdown-item"
						href="products/${electronic.subCategoryId}">${electronic.subCategoryName}</a>
				</c:forEach>

			</div></li>
			
			
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> Men </a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Link 1</a> <a
					class="dropdown-item" href="#">Link 2</a> <a class="dropdown-item"
					href="#">Link 3</a>
			</div></li>
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> Women </a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Link 1</a> <a
					class="dropdown-item" href="#">Link 2</a> <a class="dropdown-item"
					href="#">Link 3</a>
			</div></li>
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> Kids </a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Link 1</a> <a
					class="dropdown-item" href="#">Link 2</a> <a class="dropdown-item"
					href="#">Link 3</a>
			</div></li>
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="#" id="navbardrop" data-toggle="dropdown"> Home appliances
		</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Link 1</a> <a
					class="dropdown-item" href="#">Link 2</a> <a class="dropdown-item"
					href="#">Link 3</a>
			</div></li>
	</ul>
	</nav>
<br>
<%@include file="carousel.jsp" %> 

<%@include file="footer.jsp" %>	

</body>
</html>
