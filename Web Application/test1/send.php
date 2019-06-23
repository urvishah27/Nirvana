<?php
include("connect.php");

$name=$_POST['quest'];

$sql="INSERT INTO questions VALUES('$name','')";

if(!mysqli_query($conn,$sql))
{
	echo "not inserted";
}
else{
	echo "inserted";
	header('Location:questions.php');
}
?>