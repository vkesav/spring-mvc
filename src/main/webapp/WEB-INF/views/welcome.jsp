<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Spring 4 MVC Hello World Example</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>Hello World, Spring MVC</h2>

	<p>Welcome, ${name}</p>
	
	<p>${msg}</p>
</body>
</html>