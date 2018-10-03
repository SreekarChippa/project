<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>    

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="contextpath.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Mobile</title>
</head>
<body>

<springform:form action="${contextPath}/vendor/mobileprocess" method="post" modelAttribute="mobile" enctype="multipart/form-data">

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
