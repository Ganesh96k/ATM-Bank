<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposite</title>
	<link type="text/css" rel="stylesheet" href="/url1/css/deposite.css">
</head>
<body>
	<header>
        <h1>Welcome ATM Bank</h1>
    </header>
    	<main class="main1">
    	 	<form action="/check1" class="form_class1">
				<h1>Deposite section</h1>
				Enter Amount: <input class="field_class" type="number" name="deposite" placeholder="Deposite Amount" ><br>
					<font color="red">${errorMessage}</font><br>
				<button class="submit_class" type="submit">Submit</button>
			</form>
	 	</main>
    <footer>
        <p>Developed By <a href="#">GaneshSawant&trade;</a></p>
    </footer>
</body>
</html>