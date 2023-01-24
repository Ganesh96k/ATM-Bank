<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mini-Statement</title>
	<link type="text/css" rel="stylesheet" href="/url1/css/mini.css">
</head>
<body>
	<header>
        <h1>Welcome ATM Bank</h1>
    </header>
    	<main class="main1">
    	 	<form action="/check1" class="form_class1">
				<h1>Mini-Statment section</h1>
				<p>----------------------------------------</p>
				<p>Name: "<%=request.getParameter("name") %>"</p>
				<p>Balance: "<%=request.getParameter("balance") %>"</p>
				<p>----------------------------------------</p>
				<p>Transation Date: "<%=request.getParameter("date") %>"</p>
				<p>----------------------------------------</p>
				<br>
				<h2>** Thank You **</h2>
				<br>
				<button class="submit_class" type="submit">Submit</button>
			</form>
	 	</main>
    <footer>
        <p>Developed By <a href="#">GaneshSawant&trade;</a></p>
    </footer>

</body>
</html>