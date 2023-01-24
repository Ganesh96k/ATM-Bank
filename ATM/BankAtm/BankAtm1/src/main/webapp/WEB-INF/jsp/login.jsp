<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
 	<link type="text/css" rel="stylesheet" href="/url1/css/Mystyle.css">
</head>
<body>
    <header>
        <h1>Welcome ATM Bank</h1>
    </header>
    <main class="main">
        <form id="login_form" class="form_class" action="/check" method="post">
        	<font color="red">${errorMessage}</font><br>
            <div class="form_div">
                <label>Login:</label>
                <input class="field_class" name="name" type="text" placeholder="Enter User Name" autofocus>
                <label>Password:</label>
                <input id="pass" class="field_class" name="pass" type="password" placeholder="Enter Password">
                <button class="submit_class" type="submit" form="login_form">Enter</button>
            </div></form>
            <form action="/register">
            <div class="form_class">
                <p>New User Register Here:<button type="submit" class="submit_class">Click Here</button></p>
            </div>
            </form>
        
    </main>
    <footer>
        <p>Developed By <a href="#">GaneshSawant&trade;</a></p>
    </footer>
</body>
</html>