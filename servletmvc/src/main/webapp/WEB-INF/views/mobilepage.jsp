<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>    

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="contextpath.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  
<title>Adding Mobile</title>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link text-primary" href="${contextPath}/vendor/categories">Back to Categories Page</a>
    </li>
    <li class="nav-item">
      <a class="nav-link text-primary" href="${contextPath}/vendor/vendorpage">Back to Vendor Page</a>
    </li>
  </ul>
</nav>
<br>

<section class="container-fluid bg">
		<section class="row justify-content-center">
			<section class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="${contextPath}/vendor/mobileprocess" method="post" modelAttribute="mobile" enctype="multipart/form-data">
					
					<div class="form-group">
						<label for="mobileRam">Ram</label> <input type="text"
							class="form-control" id="mobileRam"  name="mobileRam" placeholder="Enter Ram">
					</div>
					<div class="form-group">
						<label for="mobileRom">Rom</label> <input type="text"
							class="form-control" id="mobileRom"  name="mobileRom" placeholder="Enter Rom">
					</div>
					<div class="form-group">
						<label for="processor">Processor</label> <input type="text"
							class="form-control" id="processor"  name="processor" placeholder="Enter Processor">
					</div>
					<div class="form-group">
						<label for="primaryCam">Primary Cam</label> <input type="text"
							class="form-control" id="primaryCam"  name="primaryCam" placeholder="Enter Primary Cam">
					</div>
					<div class="form-group">
						<label for="secondaryCam">Secondary Cam</label> <input type="text"
							class="form-control" id="secondaryCam"  name="secondaryCam" placeholder="Enter Secondary Cam">
					</div>
					<div class="form-group">
						<label for="brand">Brand</label> <input type="text"
							class="form-control" id="brand"  name="brand" placeholder="Enter Brand">
					</div>
					<div class="form-group">
						<label for="model">Model</label> <input type="text"
							class="form-control" id="model"  name="model" placeholder="Enter Model">
					</div>
					<div class="form-group">
						<label for="warranty">Warranty</label> <input type="text"
							class="form-control" id="warranty"  name="warranty" placeholder="Enter Warranty">
					</div>
					<div class="form-group">
						<label for="price">Price</label> <input type="text"
							class="form-control" id="price"  name="price" placeholder="Enter Price">
					</div>
					<div class="form-group">
						<label for="numOfProducts">Number Of Products</label> <input type="text"
							class="form-control" id="numOfProducts"  name="numOfProducts" placeholder="Enter number Of Products">
					</div>
					<div class="form-group">
						<label for="image">Image</label> <input type="file"
							class="form-control" id="image"  name="image" path="Select Picture">
					</div>
					<div class="form-group">
						<label for="subCategory.subCategoryId">SubCategoryId</label> <input type="text"
							class="form-control" id="price"  name="SubCategoryId" value="${subCategoryId}">
					</div>
					<div class="form-group">
						<label for="vendor.vendorId">VendorId</label> <input type="text"
							class="form-control" id="vendor.vendorId"  name="VendorId" value="${vendorId}">
					</div>
					
					<button type="submit" class="btn btn-primary btn-block">Add Product</button>
				</form>
			</section>
		</section>
	</section>

<%-- <springform:form action="${contextPath}/vendor/mobileprocess" method="post" modelAttribute="mobile" enctype="multipart/form-data">

<div class="bg">
	<div class="container-fluid bg">
		<div class="row">
		
				<springform:label path="mobileRam">Ram:</springform:label>
				<springform:input path="mobileRam"/>
				</div>
				
				<div class="form-group">
				<springform:label path="mobileRom">Rom:</springform:label>
				<springform:input path="mobileRom"/>
				</div>
				
				<div class="form-group">
				<springform:label path="processor">Processor:</springform:label>
				<springform:input path="processor"/>
				</div>
				
				<div class="form-group">
				<springform:label path="primaryCam">PrimaryCam:</springform:label>
				<springform:input path="primaryCam"/>
				</div>
				
				<div class="form-group">
				<springform:label path="secondaryCam">SecondaryCam:</springform:label>
				<springform:input path="secondaryCam"/>
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
				<springform:label path="price">Price:</springform:label>
				<springform:input path="price"/>
				</div>
				
				<div class="form-group">
				<springform:label path="numOfProducts">NumberOfProducts:</springform:label>
				<springform:input path="numOfProducts"/>
				</div>
				
			 	<div class="form-group">
				<springform:label path="image">Image:</springform:label>
				<springform:input type="file" class="form-control" path="image"/>
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

</div> --%>

</body>
</html> 
