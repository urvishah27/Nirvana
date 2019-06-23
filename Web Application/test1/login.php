<html>
<head>
	<title>Nirvana</title>
	<link rel="icon" href="Nirvana.ico" type="C:\wamp64\www\test1\img/ico" sizes="16x16">
	<!-- <link rel="stylesheet" type="text/css" href="css/bootstrap.css"> -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet">
	<style>
	body,html{
	height: 100%;
}

.login {
	background-image: url("C:/wamp64/www/test1/img/stay strong.jpg");
	height: 100%;
	font-family: "Source Sans Pro";
	background-size: cover;
	background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

.signup {
	background-image: url("../img/buddha.jpg");
	font-family: "Source Sans Pro";
	background-size: cover;
	height: 100%;
	background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}

.loginForm {
	width: 40%;
	height: 50%;
	/*border: 3px solid black;*/
	border-radius: 10px;
	margin: 100px auto auto auto;
	text-align: center;
	background-color: rgba(255, 255, 255, 0.7);
}

.signupForm {
	width: 30%;
	/*border: 3px solid black;*/
	border-radius: 10px;
	margin-right: 20px;
	margin-top: 50px;
	float: right;
	text-align: center;
	background-color: rgba(255, 255, 255, 0.7);
	padding-bottom: 15px;
}

.sup{
	color: black;
	align:center;
}

.formInput {
	width: 60%;
	border-top: none;
	border-right: none;
	border-left: none;
	border-bottom: 1px black solid;
	height: 30px;
	background-color: transparent;
	color: black;
	padding-left: 10px;
}

.formInput:focus {
	/*background-color: white;*/
	border: 2px solid black;
	border-radius: 5px;
}

#submitButton {	
	width: 20%;
	border: 2px solid black;
	border-radius: 10px;
	color: white;
	font-family: 'Source Sans Pro';
	font-size: 30px;
	padding: 3px 10px 10px;
	background-color: #2C9BE8;
	height: 30px;
	text-decoration: none;
	text-shadow: 2px 2px 5px black;
	font-size: 2em;
	opacity: 0.7;
	margin-left: 35%;
}

#submitButton:hover {
	opacity: 1;
	transition-duration: 0.5s;
}

.fault{color:red;}
</style>
</head>
<body class="login">
	<form class="loginForm">
		<h1 style="font-family: papyrus;">Login to Nirvana</h1>
		<br><br>
		<div><input type="text" name="LoginID" placeholder="Email Address" class="formInput"></div><br>
		<div><input type="password" name="Passwd" placeholder="Password" class="formInput"></div><br>
		<div class="intro-button mx-auto" id="submitButton">
              <a class="btn btn-primary btn-xl" href="index.php">Login</a>
            </div>
	</form>
</body>