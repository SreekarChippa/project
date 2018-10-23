<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

    </head>

    <body>
       
        <nav class="navbar navbar-expand-md bg-dark navbar-dark">
            <!-- Brand -->
            <a class="navbar-brand  text-danger" href="#">Ecommerce</a>
          
            <!-- Toggler/collapsibe Button -->
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
              <span class="navbar-toggler-icon"></span>
            </button>
          
            <!-- Navbar links -->
            <div class="collapse navbar-collapse  justify-content-end" id="collapsibleNavbar">
              <ul class="navbar-nav">
                <li class="nav-item">
                  <a class="nav-link text-white" href="${contextPath}/">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-white" href="${contextPath}/admin/adminprofile">Profile</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link text-white" href="edit">Edit Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-white" href="vendordetails">Vendor's</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link text-white" href="${contextPath}/admin/logout">Logout</a>
                  </li>

              </ul>
            </div>
          </nav>  
       <br>
    <h1>Welcome To Admin Page!</h1>
           
    </body>
 
</html>