<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
		Enter your id : <input type="text" name="aid"><br>
		Enter your name : <input type="text" name="aname"><br>
		<input type="submit">
	</form>
	<hr>
	<form action="getAlien" method="get">
		Enter your id : <input type="text" name="aid"><br>
		<input type="submit">
	</form>
</body>
</html>