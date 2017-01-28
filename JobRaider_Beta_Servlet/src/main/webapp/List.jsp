<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,servlet.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Listar</title>
	</head>
	<body>
	
	<form method="post" action="select">	
		<input type="submit"  value="Mostrar">	
		<input type="button" onclick="window.location.href='index.jsp'"  value="Volver">	
	</form>	
	<br>
	<br>
		<table>
				<thead>
					<tr>
						<td>Nombre</td>
						<td>Estado</td>
						<td>Dia</td>
						<td>Hora</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="log" items="${listAllLog}">
						<tr>
							<td><c:out value="${log.name}"/> </td>
							<td><c:out value="${log.state}"/> </td>
							<td><c:out value="${log.date}"/> </td>
							<td><c:out value="${log.hour}"/> </td>
						</tr>
					</c:forEach>
				</tbody>
		</table>
	</body>
</html>