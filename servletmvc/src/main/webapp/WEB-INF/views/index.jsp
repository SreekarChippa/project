<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<spring:url value="/staticresources/images" var="images"> </spring:url> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ecommerce</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script  src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script  src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script  src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

  <nav class="navbar navbar-expand-md bg-dark navbar-dark"> <a
    class="navbar-brand text-warning" href="">Ecommerce</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse"
    data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
   <div class="dropdown collapse navbar-collapse justify-content-left">
    <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown">
      Vendor
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="vendorsignup">Sign Up</a>
      <a class="dropdown-item" href="vendorlogin">Login</a>
    </div>
  </div>
   <div class="dropdown">
    <button type="button" class="btn btn-dark dropdown-toggle" data-toggle="dropdown">
      Customer
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="customersignup">Sign Up</a>
      <a class="dropdown-item" href="customerlogin">Login</a>
    </div>
  </div>
  </nav>

</body>
</html>

<!-- <!DOCTYPE html>
<html lang="en">
<head>
  <title>Ecommerce</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Ecommerce</a>
    </div>

    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="vendorsignup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="vendorlogin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>

  </div>
</nav>

</body>
</html>
 -->