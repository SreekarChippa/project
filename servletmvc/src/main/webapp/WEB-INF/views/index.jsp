<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<spring:url value="/staticresources/images" var="images"> </spring:url> 

<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Ecommerce</title>
</head>

<body>


<nav class="navbar navbar-expand-sm bg-danger justify-content-center">

<div class="container-fluid">
  <!-- Brand/logo -->
  <!-- <div class="container-header">
    <a class="navbar-brand" href="#">
      <img src="ecommerce-icon.jpg" alt="logo" style="width:40px;">
    </a>

  </div> -->


  <div>
    <nav class="navbar navbar-expand-sm bg-danger justify-content-center">
    <form class="form-inline" action="/action_page.php">
        <input class="form-control mr-sm-2" type="text" placeholder="Search for products,brands and more">
        <button class="btn btn-success" type="submit">Search</button>
      </form>
  </div>

  <nav class="navbar navbar-expand-sm bg-danger navbar-light justify-content-end">
    <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">Sign Up</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Login</a>
    </li>
  </ul>
</div>

</nav>

<nav class="navbar navbar-expand-sm bg-light justify-content-end">

<div class="container-fluid">
  <div class="dropdown">

    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Electronics
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">link1</a>
      <a class="dropdown-item" href="#">link2</a>
    </div> 

    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Tv's & Appliances
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">link11</a>
      <a class="dropdown-item" href="#">link22</a>
    </div>

    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Men      
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">links</a>
    </div> 

    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Women      
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">linkr</a>
    </div>

    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Baby & kids      
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">link</a>
    </div>

    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
      Home & Furniture      
    </button>
    <div class="dropdown-menu">
      <a class="dropdown-item" href="#">link</a>
    </div>

  </div>
  
</div>


</nav>
  
<div class="container">
  <img src="ecommerce-3.jpg" class="mx-auto d-block" style="width:50%"> 
</div>
   
</body>
</html>
