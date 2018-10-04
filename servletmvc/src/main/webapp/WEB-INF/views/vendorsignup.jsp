 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  
</head>
<body>
<%@include file="back.jsp" %>

	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<section class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="vendorregisterprocess" method="post" modelAttribute="vendor">
					<h3>Welcome To Vendor Signup Page!</h3>
					<div class="form-group">
						<label for="name">Name</label> <input type="name"
							class="form-control" id="name"  name="name" placeholder="Enter name">
					</div>
					<div class="form-group">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email"  name="email" placeholder="Enter email">
					</div>
					<div class="form-group">
						<label for="mobile">Mobile</label> <input type="mobile"
							class="form-control" id="mobile"  name="mobile" placeholder="Enter mobile">
					</div>
					
					<div class="form-group">
						<label for="password">Password</label> 
						<input type="password" class="form-control" id="password"  name="password" placeholder="Enter Password">
					</div>
					<div class="form-group">
						<label for="confirmPassword">Confirm Password</label> 
						<input type="password" class="form-control" id="confirmPassword"  name="confirmPassword" placeholder="Confirm Password">
					</div>
					<div class="form-group">
						<label for="companyName">Company Name</label> <input type="companyName"
							class="form-control" id="companyName"  name="companyName" placeholder="Enter Company Name">
					</div>

					<button type="submit" class="btn btn-primary btn-block">Sign Up</button>
				</form>
			</section>
		</section>
	</section>

</body>
</html> 
