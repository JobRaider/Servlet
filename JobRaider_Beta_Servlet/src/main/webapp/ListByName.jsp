<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,servlet.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Usuario</title>
		<style>
			body {font-family: Arial, Helvetica, sans-serif;}

			table {     font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
			    font-size: 12px;  width: 480px; text-align: left;    border-collapse: collapse; }
			
			thead {     font-size: 13px;     font-weight: normal;     padding: 8px;     background: #b9c9fe;
			    border-top: 4px solid #aabcfe;    border-bottom: 1px solid #fff; color: #039; }
			
			td {    padding: 8px;     background: #e8edff;     border-bottom: 1px solid #fff;
			    color: #669;    border-top: 1px solid transparent; }
			
			tr:hover td { background: #d0dafd; color: #339; }
		</style>
	</head>
	<body>
		<input type="button" onclick="window.location.href='List.jsp'"  value="Volver">	
		<br>
		<br>
		<table>
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Estado</th>
					<th>Dia</th>
					<th>Hora</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="log" items="${listAllLogByName}">
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