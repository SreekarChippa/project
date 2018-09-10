<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css" href="registerstyle.css">
</head>
<body>

	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<section class="col-12 col-sm-6 col-md-3">
				<spring:form class="form-container" action="vendorregisterprocess" method="post" modelAttribute="vendor">
					
					<div class="form-group">
						<spring:label path="name">Name</spring:label>
						<spring:input type="text" class="form-control" path="name"
							placeholder="Enter  name" />
					</div>
					<div class="form-group">
						<spring:label path="email">Email</spring:label>
						<spring:input type="email" class="form-control"
							path="email" placeholder="Enter email" />
					</div>

					<div class="form-group">
						<spring:label path="mobile">Mobile</spring:label>
						<spring:input type="phone" class="form-control"
							path="mobile" placeholder="Enter mobile number" />
					</div>
					<div class="form-group">
						<spring:label path="password">Password</spring:label>
						<spring:input type="password" class="form-control"
							path="password" placeholder="Enter Password" />
					</div>
					<div class="form-group">
						<spring:label path="companyName">Company Name</spring:label>
						<spring:input type="text" class="form-control"
							path="companyName" placeholder="Enter compnay name" />
					</div>

					<button type="submit" class="btn btn-primary btn-block">Register</button>
				</spring:form>
			</section>
		</section>
	</section>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>

</body>
</html>