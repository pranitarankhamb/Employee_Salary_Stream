<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>
<link href="CSS/AdinLogin.css" rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	
	<div align=center>
		<h1>Admin Login</h1>
	
	
	<form action=loginServlet method=post>
		<table>
			<tr><td>Enter Username:</td><td><input type=text name=username></td></tr>
			<tr><td>Enter Password:</td><td><input type=password name=pass></td></tr>
			<tr><td><input type=submit name=login></td><td><input type=reset></td></tr>
			
		</table>
	
	</form>
</div>

	<!-- Offcanvas and Bootstrap JavaScript -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>


