<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Implantar Variáveis</title>
</head>
<body>
	
	<h1>Implantar Variáveis</h1>
	Variavel com alcance request: ${mensagem}
	<br>
    <br>
	Variavel em alcance de session:
	<br>
	<!-- O java beans chama diretamente os metodos get somente com o nome do atributo, ate a area que nao tem variavel -->
	Retangulo:
	Base: ${retangulo.base}
	Altura: ${retangulo.altura}
	Area: ${retangulo.area}
	<br>
	<br>
	 <a href="<%=request.getContextPath() %>/index.jsp">Voltar ao Início</a>
	
</body>
</html>