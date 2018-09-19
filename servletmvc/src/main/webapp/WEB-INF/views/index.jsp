<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


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
	
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" 
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

<!-- <style>
/* Make the image fully responsive */
.carousel-inner img {
	width: 100%;
	height: 100%;
}
</style> -->

</head>
<body>

	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<div class="navbar navbar-collapse justify-content-left">
		<a class="navbar-brand text-warning" href="">Ecommerce</a>
	</div>
	<div class="navbar-navbar justify-content-end">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">HOME</a></li>
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
			<a class="dropdown-item" href="vendorsignup">Sign Up</a> <a
				class="dropdown-item" href="vendorlogin">Login</a>
		</div>
	</div>

	<div class="dropdown collapse navbar-collapse justify-content-end">
		<button type="button" class="btn btn-dark dropdown-toggle"
			data-toggle="dropdown">Customer</button>
		<div class="dropdown-menu">
			<a class="dropdown-item" href="customersignup">Sign Up</a> <a
				class="dropdown-item" href="customerlogin">Login</a>
		</div>
	</div>
	</nav>

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

<%@include file="carousel.jsp" %>

	<!-- Footer -->
	<footer class="page-footer font-small stylish-color-dark pt-4">

	<!-- Footer Links -->
	<div class="container text-center text-md-left">

		<!-- Grid row -->
		<div class="row">

			<!-- Grid column -->
			<div class="col-md-4 mx-auto">

				<!-- Content -->
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4">Footer
					Content</h5>
				<p>Here you can use rows and columns here to organize your
					footer content. Lorem ipsum dolor sit amet, consectetur adipisicing
					elit.</p>

			</div>
			<!-- Grid column -->

			<hr class="clearfix w-100 d-md-none">

			<!-- Grid column -->
			<div class="col-md-2 mx-auto">

				<!-- Links -->
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

				<ul class="list-unstyled">
					<li><a href="#!">Link 1</a></li>
					<li><a href="#!">Link 2</a></li>
					<li><a href="#!">Link 3</a></li>
					<li><a href="#!">Link 4</a></li>
				</ul>

			</div>
			<!-- Grid column -->

			<hr class="clearfix w-100 d-md-none">

			<!-- Grid column -->
			<div class="col-md-2 mx-auto">

				<!-- Links -->
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

				<ul class="list-unstyled">
					<li><a href="#!">Link 1</a></li>
					<li><a href="#!">Link 2</a></li>
					<li><a href="#!">Link 3</a></li>
					<li><a href="#!">Link 4</a></li>
				</ul>

			</div>
			<!-- Grid column -->

			<hr class="clearfix w-100 d-md-none">

			<!-- Grid column -->
			<div class="col-md-2 mx-auto">

				<!-- Links -->
				<h5 class="font-weight-bold text-uppercase mt-3 mb-4">Links</h5>

				<ul class="list-unstyled">
					<li><a href="#!">Link 1</a></li>
					<li><a href="#!">Link 2</a></li>
					<li><a href="#!">Link 3</a></li>
					<li><a href="#!">Link 4</a></li>
				</ul>

			</div>
			<!-- Grid column -->

		</div>
		<!-- Grid row -->

	</div>
	<!-- Footer Links -->

	<hr>

	<!-- Call to action -->
	<ul class="list-unstyled list-inline text-center py-2">
		<li class="list-inline-item">
			<h5 class="mb-1">Sell on</h5>
		</li>
		<li class="list-inline-item"><a
			href="http://localhost:8082/servletmvc/vendorsignup"
			class="btn btn-danger btn-rounded">Sign up!</a></li>
		<li class="list-inline-item">
			<h5 class="mb-1">Buy on</h5>
		</li>
		<li class="list-inline-item"><a
			href="http://localhost:8082/servletmvc/customersignup"
			class="btn btn-danger btn-rounded">Sign up!</a></li>
	</ul>

	<hr>

	<!-- Social buttons -->
	<ul class="list-unstyled list-inline text-center">
		<li class="list-inline-item"><a class="btn-floating btn-fb mx-1">
				<i class="fa fa-facebook"> </i>
		</a></li>
		<li class="list-inline-item"><a class="btn-floating btn-tw mx-1">
				<i class="fa fa-twitter"> </i>
		</a></li>
		<li class="list-inline-item"><a
			class="btn-floating btn-gplus mx-1"> <i class="fa fa-google-plus">
			</i>
		</a></li>
		<li class="list-inline-item"><a class="btn-floating btn-li mx-1">
				<i class="fa fa-linkedin"> </i>
		</a></li>
		<li class="list-inline-item"><a
			class="btn-floating btn-dribbble mx-1"> <i class="fa fa-dribbble">
			</i>
		</a></li>
	</ul>

	<!-- Copyright -->
	<div class="footer-copyright text-center py-3">
		© 2018 Copyright: <a href="http://localhost:8082/servletmvc//">
			Ecommerce.com</a>
	</div>

	</footer>

</body>
</html>
