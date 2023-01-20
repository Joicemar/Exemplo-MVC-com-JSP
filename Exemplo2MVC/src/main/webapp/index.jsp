<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Exemplo MVP 2</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
	<body>
	    <h1>Exemplo MVC 2</h1>
	    <br/>
	    
	    <div style="color: red">${mensagem}</div>
		<a href="<%=request.getContextPath()%>/ServletControlador ">
		Link para o servlet controlador sem parâmetros</a>
		<br>
		<br>
		<a href="<%=request.getContextPath()%>/ServletControlador?action=adicionaVariaveis ">
		Link para o servlet controlador para adicionar variaveis</a>
		<br>
		<br>
		<a href="<%=request.getContextPath()%>/ServletControlador?action=listarVariaveis ">
		Link para o servlet controlador para listar variaveis</a>
		<br>
		<br>
		
	</body>
</html>