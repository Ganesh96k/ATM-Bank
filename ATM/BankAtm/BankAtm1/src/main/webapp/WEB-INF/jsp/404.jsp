<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ATM 2nd Step</h1>

<%=request.getParameter("user") %>
"${user}"
<%= session.getAttribute("name") %>

<script type="text/javascript">
	var user1 = "${user}"
	
	document.write("<h2>My First Web Page</h2>");
	document.write(user1);
	
	switch(user1) {
	case "Withdraw":
		document.write("---Withdraw---");
		document.write("Please Enter Amount");
		break;
	case "Deposite":
		System.out.println("---Deposite---");
		break;
	case "Mini":
		System.out.println("---Mini---");
		break;
	case "Enq":
		System.out.println("---Enq---");
		break;
	case "Exit":
		System.out.println("---Exit---");
		break;
}
</script>



</body>
</html>