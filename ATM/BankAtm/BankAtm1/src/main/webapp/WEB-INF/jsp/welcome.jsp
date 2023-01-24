<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
		<link type="text/css" rel="stylesheet" href="/url1/css/Mystyle.css">
</head>
<body>
<header>
        <h1 class="h1_class">Welcome ATM Bank</h1>
</header>
	<main>
		<div class="div1">
			<form action="/atm-req">
				<p class="h1_hello">Login  Sucessful</p><br>
				<h1 >Hello "<%=request.getParameter("name") %>"</h1><br>
				<button class="submit_class" type="submit">Enter To ATM</button>
			</form>
		</div>
	</main>
<footer>
        <p class="fp">Developed By <a class="fpa" href="#">GaneshSawant&trade;</a></p>
</footer>
</body>
</html>