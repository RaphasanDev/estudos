<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page	import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	<c:if test="${ not empty empresa }">
	Empresa ${ empresa } Cadastrada com sucesso. Nome fantasia: ${ fantasia }.
	</c:if>
	
	lista empresas:
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
		
		<li> Empresa: ${ empresa.nome }, Nome fantasia: ${empresa.fantasia } Data abertura: - 
			<fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyy"/>
			<a href="/gerenciador/removeEmpresa?id=${empresa.id }">remove</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>