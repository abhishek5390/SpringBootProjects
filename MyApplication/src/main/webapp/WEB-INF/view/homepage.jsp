<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>MyApplication | home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">MyApplication</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Login</a></li>
					<li><a href="/register">New Registration</a></li>
					<li><a href="/showusers">All Users</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to MyApplication</h1>
			<h2>You have been successfully logged in</h2>
			<h3>Developer : Abhishek Gudigar</h3>
		</div>
	</div>
	
	<div class="container text-centered">
		<div class="alert alert-success">
			<h4>Session 1: Spring boot Tutorials</h4>
		</div>
		<iframe width="400" height="200" src="https://www.youtube.com/embed/35EQXmHKZYs" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	</div>
	
	<div class="container text-centered">
		<div class="alert alert-success">
			<h4>Session 2: SQL Tutorials</h4>
		</div>
		<iframe width=400" height="200" src="https://www.youtube.com/embed/HXV3zeQKqGY" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	</div>
	
	<div class="container text-centered">
		<div class="alert alert-success">
			<h4>Session 3: GIT Tutorials</h4>
		</div>
		<iframe width="400" height="200" src="https://www.youtube.com/embed/WbwIoQYP6no" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	</div>
	
	<div class="container text-centered">
		<div class="alert alert-success">
			<h4>Session 4: Python Tutorials</h4>
		</div>
		<iframe width="400" height="200" src="https://www.youtube.com/embed/_uQrJ0TkZlc" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>