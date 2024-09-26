<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaempresa" var="linkServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${ linkServlet }" method="post">
	
		Nome: <input type="text" name="nome"> 
		Fantasia: <input type="text" name="fantasia"/>
		Data Abertura: <input type="text" name="data"/>
		<input type="submit"/>
		
	</form>
</body>
</html>