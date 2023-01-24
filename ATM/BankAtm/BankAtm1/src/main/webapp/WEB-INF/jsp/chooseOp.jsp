<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="/url1/css/chooseOp.css">
</head>
<body>
    <header>
        <h1>Welcome ATM Bank</h1>
    </header>
       <main class="main1">
			<form action="/check1" method="post" class="form_class1">
			<h3>Choose your Option</h3>
			 <label  class="radio-inline">
			   Withdraw :      <input  type="radio" name="radioName" id="Withdraw"  value="Withdraw" checked="checked"/><br>
			 </label>
			 <label  class="radio-inline">
			   Deposite :      <input  type="radio" name="radioName"  id="Deposite" value="Deposite"/><br>
			 </label>
			 <label  class="radio-inline">
			   Mini Statement :<input  type="radio" name="radioName"  id="Mini" value="Mini"/><br>
			 </label>
			 <label  class="radio-inline">
			   Bank Enqary :   <input  type="radio" name="radioName"  id="Enq" value="Enq"/><br>
			 </label>
			 <label  class="radio-inline">
			   Exit :          <input  type="radio" name="radioName"  id="Exit" value="Exit"/><br>
			 </label>
			 <input name="submit" type="submit" onsubmit="/check1">
			 </form>
		</main>
	<footer>
        <p>Developed By <a href="#">GaneshSawant&trade;</a></p>
    </footer>

</body>
</html>