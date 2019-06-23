<html>
<head>
	<title>Nirvana</title>
	<link rel="icon" href="mental health.ico" type="image/ico" sizes="16x16">
	<link rel="stylesheet" type="text/css" href="css/login.css">
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet">
	<script src="auth.js"></script>
</head>
<body class="signup">
	<div class="signupForm">
		<h1>Join Nirvana</h1>
		<div class="sup">Or <a href="login.html">Login</a></div>
		<br><br>
		<form name="SignupForm" onsubmit="return formValidate()" method="post" action="index.html">
		
		<div><input type="text" name="name" placeholder="First Name" class="formInput" id="name" required></div><br>
		<span id="namefault" class="fault"></span>

		<div><input type="email" name="EmailAdd" placeholder="Email Address"class="formInput" id="EmailAdd" required></div><br>
		<span id="emailfault" class="fault"></span>

		<div><input type="number" name="Number" placeholder="Mobile Number" class="formInput" id="Number" required></div><br>
		<span id="numberfault" class="fault"></span>
		
		<div>
			<span >Gender: </span><input type="radio" name="gender" value="male" checked> <span> Male   </span> 
  			<input type="radio" name="gender" value="female"><span> Female </span>
  			<input type="radio" name="gender" value="others"><span> Others </span>
  		</div><br>
	
		<div><span>Date of Birth: </span><input type="date" name="bday" required></div><br>
		
		<div><input type="password" name="SupPasswd" placeholder="Password" class="formInput" id="SupPasswd" required></div><br>
		<span id="passwdfault" class="fault"></span>
		
		<div><input type="password" name="RepSupPasswd" placeholder="Confirm Password" class="formInput" id="RepSupPasswd" required></div><br>
		<span id="conpasswdfault" class="fault"></span>
		
		<button type="submit" class="submitButton">Submit</button>
	</form>
	</div>
</body>