<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <h1>Exemplo MVC</h1>
    <br/>
    <!--Chamando indiretamente o metodo contextPath. ServletControlador usado para mapear esse controlador-->
    <a href="<%=request.getContextPath() %>/ServletControlador">Link para o controlador de variaveis</a>

</body>
</html>