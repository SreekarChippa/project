<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Mobile</title>
</head>
<body>

<springform:form action="mobileprocess" method="post" modelAttribute="mobile" enctype="multipart/form-data">

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

</div>

</body>
</html> 


<%-- 

<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<html>
<head>
<title>Add laptop Page</title>

<link rel="stylesheet"	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>


<link rel="stylesheet" type="text/css" href="registerstyle.css">
</head>
<body>

	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<section class="col-12 col-sm-6 col-md-3">
				<spring:form class="form-container" action="laptoprocess" method="post" modelAttribute="laptop">
					<h2>Add Laptop</h2>

					<div class="form-group">
						<spring:label path="subCategory.subCategory_id">SubCategory ID</spring:label>
						<spring:input class="form-control"
							path="subCategory.subCategory_id" type="hidden"
							value="${subCategory_id }" placeholder="Enter  subcategory id" />
					</div>
					<div class="form-group">
						<spring:label path="vendor.vendor_id">Vendor Id</spring:label>
						<spring:input class="form-control" path="vendor.vendor_id"
							type="hidden" value="${vendor_id }"
							placeholder="Enter  vendor  id" />
					</div>
					<div class="form-group">
						<spring:label path="product_brand">Product Brand</spring:label>
						<spring:input type="text" class="form-control"
							path="product_brand" placeholder="Enter  brand" />
					</div>
					<div class="form-group">
						<spring:label path="product_name">product Name</spring:label>
						<spring:input type="text" class="form-control" path="product_name"
							placeholder="Enter  product name" />
					</div>
					<div class="form-group">
						<spring:label path="product_price">product _price</spring:label>
						<spring:input type="text" class="form-control"
							path="product_price" placeholder="Enter  price" />
					</div>
					<div class="form-group">
						<spring:label path="ram">Ram</spring:label>
						<spring:input type="text" class="form-control" path="ram"
							placeholder="Enter  ram size" />
					</div>
					<div class="form-group">
						<spring:label path="laptopName">Laptop Name</spring:label>
						<spring:input type="text" class="form-control" path="laptopName"
							placeholder="Enter laptop name" />
					</div>

					<div class="form-group">
						<spring:label path="processor">Processor</spring:label>
						<spring:input type="text" class="form-control" path="processor"
							placeholder="Enter processor" />
					</div>
					<div class="form-group">
						<spring:label path="harddisk">Harddisk</spring:label>
						<spring:input type="text" class="form-control" path="harddisk"
							placeholder="Enter harddisk size" />
					</div>
					<div class="form-group">
						<spring:label path="numberOfProducts">Number Of Products</spring:label>
						<spring:input type="text" class="form-control" path="numberOfProducts"
							placeholder="Enter no of products" />
					</div>
					
                     

					<button type="submit" class="btn btn-primary btn-block">AddLaptop</button>
				</spring:form>
			</section>
		</section>
	</section>


</body>

</html> --%>