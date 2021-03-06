<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@include file="contextpath.jsp" %>
<html>
<head>
<title>Add mobile Page</title>
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
				<spring:form class="form-container" action="${contextPath}/vendor/editmobileprocess"
					method="post" modelAttribute="mobile" enctype="multipart/form-data">
					<h2>Edit  Mobile</h2>
					<div class="form-group">
						<spring:label path="subCategory.subCategoryId">SubCategory ID</spring:label>
						<spring:input class="form-control"
							path="subCategory.subCategoryId" type="hidden"
							value="${subCategoryId }" placeholder="Enter  subcategory id" />
					</div>
					<div class="form-group">
						<spring:label path="vendor.vendorId">Vendor Id</spring:label>
						<spring:input class="form-control" path="vendor.vendorId"
							type="hidden" value="${vendorId }"
							placeholder="Enter  vendor  id" />
					</div>
					
					<div class="form-group">
						<spring:label path="productId">Product Id</spring:label>
						<spring:input class="form-control" path="productId"
							type="hidden" value="${productId }" />
					</div>
					<div class="form-group">
						<spring:label path="brand">Product Brand</spring:label>
						<spring:input type="text" class="form-control"
							path="brand" value="${mobile.brand}" />
					</div>
					<div class="form-group">
						<spring:label path="model">Model</spring:label>
						<spring:input type="text" class="form-control"
							path="model" value="${mobile.model}" />
					</div>
					
					<div class="form-group">
						<spring:label path="price">product price</spring:label>
						<spring:input type="text" class="form-control"
							path="price" value="${mobile.price}" />
					</div>
					<div class="form-group">
						<spring:label path="mobileRam">Ram</spring:label>
						<spring:input type="text" class="form-control" path="mobileRam"
							value="${mobileRam}" />
					</div>
					<div class="form-group">
						<spring:label path="mobileRom">Rom</spring:label>
						<spring:input type="text" class="form-control" path="mobileRom"
							value="${mobileRom}" />
					</div>
					<div class="form-group">
						<spring:label path="processor">Processor</spring:label>
						<spring:input type="text" class="form-control" path="processor"
							value="${processor}" />
					</div>
					<div class="form-group">
						<spring:label path="primaryCam">Primary Cam</spring:label>
						<spring:input type="text" class="form-control" path="primaryCam"
							value="${primaryCam}" />
					</div>
					<div class="form-group">
						<spring:label path="secondaryCam">Secondary Cam</spring:label>
						<spring:input type="text" class="form-control" path="secondaryCam"
							value="${secondaryCam}" />
					</div>
                    <div class="form-group">
						<spring:label path="numOfProducts">Number Of Products</spring:label>
						<spring:input type="text" class="form-control" path="numOfProducts" value="${mobile.numOfProducts}"
							 />
					</div>
					<div class="form-group">
						<spring:label path="image">Image</spring:label>
						<spring:input type="file" class="form-control" path="image" 
						 />
					</div>

					<button type="submit" class="btn btn-primary btn-block">Update Mobile</button>
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