<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<style>
/* Make the image fully responsive */
.carousel-inner img {
	width: 100%;
	height: 50%; 
}
</style>
</head>
<body>

	<div id="demo" class="carousel slide" data-ride="carousel">
		<ul class="carousel-indicators">
			<li data-target="#demo" data-slide-to="0" class="active"></li>
			<li data-target="#demo" data-slide-to="1"></li>
			<li data-target="#demo" data-slide-to="2"></li>
		</ul>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="${images}/oneplus.jpg" alt="oneplus" width="100" height="50">
				<div class="carousel-caption">
					<h3>Never Settle</h3>
					<p>Speed That You Need!</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="${images}/delll.jpg" alt="dell" width="100" height="50">
				<div class="carousel-caption">
					<h3>Inspiron</h3>
					<p>Feel The Infinty!</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="${images}/denim.jpg" alt="denim" width="100" height="50">
				<div class="carousel-caption">
					<h3>Comfort</h3>
					<p>Buy one get one!</p>
				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#demo" data-slide="prev"> <span
			class="carousel-control-prev-icon"></span>
		</a> <a class="carousel-control-next" href="#demo" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>

</body>
</html>