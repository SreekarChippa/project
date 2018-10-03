<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>vendor Login Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>

<link rel="stylesheet" type="text/css" href="loginstyle.css">
</head>
<body>

	<section class="container-fluid bg">
		<section class="row justify-content-center">
			<section class="col-12 col-sm-6 col-md-3">
				<form class="form-container" action="vendor/vendorloginprocess" method="post" >
					<h2>Login</h2>
					<div class="form-group">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email"  name="email" placeholder="Enter email">
					</div>
					
					<div class="form-group">
						<label for="password">Password</label> 
						<input type="password" class="form-control" id="password"  name="password" placeholder="Enter Password">
					</div>

					<button type="submit" class="btn btn-primary btn-block">Login</button>
				</form>
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


<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <script src="https://use.fontawesome.com/releases/v5.3.1/css/all.css"></script>
        <link rel="stylesheet" type="text/css" href="style.css">
  </head>
<body>
  <div class="modal-dialog text-center">
    <div class="col-sm-8 main-section">
      <div class="modal-content">

        <div class="col-12 user-img">
          <img src="loginn.png">
        </div>

        <form class="col-12">
          <div class="form-group">
            <input type="text" class="form-control" placeholder="Enter Email">
          </div>
          <div class="form-group">
            <input type="password" class="form-control" placeholder="Enter Password">
          </div>
          <div>
            <button type="submit" class="btn"><i class="fas fa-sign-in-alt"></i>Login</button>
          </div>
        </form>

      </div>
    </div>
  </div>
           
</body>
</html>

<style type="text/css">

body{
  font-family: 'Roboto', sans-serif;
  background: url(blur.jpg) no-repeat center center fixed;
  background-size: cover;
}

.main-section{
  margin: 0 auto;
  margin-top: 130px;
  padding: 0;
}

.modal-content{
  background-color: #423e3e;
  opacity: .95;
  padding: 0 18px;
  box-shadow: 0px 0px 3px #848484;
}

.user-img{
  margin-top: -50px;
  margin-bottom: 35px;
}

.user-img img{
  height: 100px;
  width: 100px;
  border-radius: 5px;
  box-shadow: 0px 0px 2px #848484;
}

.form-group{
  margin-bottom: 25px;
}

.form-group input{
  height: 42px;
  border-radius: 5px;
  border: 0;
  font-size: 18px;
  padding-left: 54px;
}

.form-group::beforre{
  font-family: 'Font Awesome\ 5 Free';
  content: "\f007"
  position: absolute;
  font-size: 22px;
  color: #555e60;
  left: 28px;
  padding-top: 4px;
}

.form-group:last-of-type::before{
  content: "\f023";
}

button{
  width: 40%;
  margin: 5px 0 25px;
}

.btn{
  background-color: #27c2a5;
  color: #fff;
  font-size: 19px;
  padding: 7px 14px;
  border-radius: 5px;
  border-bottom: 4px solid #219882;
}

.btn:hover, .btn:focus{
  background-color: #25a890;
  border-bottom: 4px solid #25a890;
}
  
</style>
 -->
