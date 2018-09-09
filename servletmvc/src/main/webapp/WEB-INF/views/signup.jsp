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

<div class="bg">
	<div class="container-fluid bg">
		<div class="row">
			<springform:form action="register" method="POST" modelAttribute="user">
				
				<div class="form-group">
					<label for="name">Name:</label>
      				<springform:input path="name" class="form-control" id="name"/>
      				<springform:errors path="name" ></springform:errors>
				</div>
				
				<div class="form-group">
					<label for="email">Email:</label>
      				<springform:input path="email" class="form-control" id="email"/>
      				<springform:errors path="email" ></springform:errors>
				</div>		
				
				<div class="form-group">
					<label for="mobile">Mobile:</label>
      				<springform:input path="mobile" class="form-control" id="mobile"/>
      				<springform:errors path="mobile" ></springform:errors>
				</div>
				
				<div class="form-group">
				<!-- 	<input type="password" id="inputPassword" class="form-control" > -->
					<label for="password">Password:</label>
      				<springform:input path="password" class="form-control" id="password"/>
				</div>
				
				<div class="form-group">
					<label for="confirmPassword">Confirm Password:</label>
      				<springform:input path="confirmPassword" class="form-control" id="confirmPassword"/>
				</div>
				
				<div class="form-group">
					<label for="companyName">Company Name:</label>
      				<springform:input path="companyName" class="form-control" id="companyName"/>
      				<springform:errors path="companyName" ></springform:errors>
				</div>
				
				<td><springform:label path="role">Role:</springform:label></td>
				
				<td>
					<ul>
						<springform:select path="role">
							<springform:option value="vendor">Vendor</springform:option>
							<springform:option value="customer">Customer</springform:option>
						</springform:select>
					</ul>
				</td>
				
				<div class="form-group form-check">
					<label class="form-check-label">
						<input class="form-check-input" type="checkbox">Remember Me</label>
				</div>
				
				<button type="submit" class="btn btn-primary btn-block">Sign Up</button>
				
				</springform:form>
				
		</div>
	
	</div>

</div>


</body>
</html>

<style> 
.bg{
	background-image:url("https://ak5.picdn.net/shutterstock/videos/15366295/thumb/4.jpg");
	width: 100%;
	height: 100%;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
} 
form{
	padding-left:500px;
	padding-bottom: 110px;

}
</style>

