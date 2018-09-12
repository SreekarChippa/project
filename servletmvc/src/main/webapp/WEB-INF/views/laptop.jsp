 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Laptop</title>

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
			<springform:form action="laptopprocess" method="POST" modelAttribute="laptop">
				
				<div class="form-group">
				<springform:label path="laptopRam">Ram:</springform:label>
				<springform:input path="laptopRam"/>
				</div>
				
				<div class="form-group">
				<springform:label path="laptopRom">Rom:</springform:label>
				<springform:input path="laptopRom"/>
				</div>
				
				<div class="form-group">
				<springform:label path="processor">Processor:</springform:label>
				<springform:input path="processor"/>
				</div>
				
				<div class="form-group">
				<springform:label path="os">OS:</springform:label>
				<springform:input path="os"/>
				</div>
				
				<div class="form-group">
				<springform:label path="brand">Brand:</springform:label>
				<springform:input path="brand"/>
				</div>
				
				<div class="form-group">
				<springform:label path="model">Model:</springform:label>
				<springform:input path="model"/>
				</div>
				
				<div class="form-group">
				<springform:label path="warranty">Warranty:</springform:label>
				<springform:input path="warranty"/>
				</div>
				
				<div class="form-group">
				<springform:label path="subCategory.subCategoryId">SubCategoryId:</springform:label>
				<springform:input path="subCategory.subCategoryId" value="${subCategoryId}"/>
				</div>
				
				<div class="form-group">
				<springform:label path="vendor.vendorId">VendorId:</springform:label>
				<springform:input path="vendor.vendorId" value="${vendorId}"/>
				</div>
	
				<button type="submit" class="btn btn-primary btn-block">Add Product</button>
				
				</springform:form>
				
		</div>
	
	</div>

</div>


</body>
</html> 

<style> 
/* .bg{
	background-image:url("https://ak5.picdn.net/shutterstock/videos/15366295/thumb/4.jpg");
	width: 100%;
	height: 100%;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}  */
form{
	padding-left:500px;
	padding-bottom: 110px;

}
</style> 

