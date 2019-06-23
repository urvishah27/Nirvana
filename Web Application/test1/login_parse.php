<?php
session_start();
include_once('connect.php');
if(isset($_POST['username'])){
  $username=$_POST['username'];
  $password=$_POST['password'];

  $sql="select * from users where username='".$username."' and password='".$password."' limit 1";
  $res=mysql_query($sql) or die(mysql_error());
  
  if(mysql_num_rows($res)==1){      
	
	$row=mysql_fetch_assoc($res);
	$_SESSION['uid']=$row['id'];
    $_SESSION['username']=$row['username'];
	header('location:index.php');
	exit();
	}else{
	echo"Invalid  login information.please reuturn to previous page";
	exit();
	}	
	}



?>