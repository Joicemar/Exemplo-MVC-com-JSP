<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alcance de Variaveis</title>
</head>
<body>
	<h1>Hello World</h1>
	<br/>
	Variaveis request:
	Base: ${retanguloRequest.base}
	Altura: ${retanguloRequest.altura}
	Area: ${retanguloRequest.area}
	<br></br>
	Variaveis session:
	Base: ${retanguloSession.base}
	Altura: ${retanguloSession.altura}
	Area: ${retanguloSession.area}
	<br></br>
	Variaveis application:
	Base: ${retanguloApplication.base}
	Altura: ${retanguloApplication.altura}
	Area: ${retanguloApplication.area}
	<br></br>
	<a href="<%=request.getContextPath()%>/index.jsp">Voltar ao Início</a>
	
</body>
</html>