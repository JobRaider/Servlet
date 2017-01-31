<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,model.*,service.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Listar</title>
		<style>
			body {font-family: Arial, Helvetica, sans-serif;}

			table {     font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
			    font-size: 12px;  width: 480px; text-align: left;    border-collapse: collapse; }
			
			thead {     font-size: 13px;     font-weight: normal;     padding: 8px;     background: #b9c9fe;
			    border-top: 4px solid #aabcfe;    border-bottom: 1px solid #fff; color: #039; }
			
			td {    padding: 8px;     background: #e8edff;     border-bottom: 1px solid #fff;
			    color: #669;    border-top: 1px solid transparent; }
			
			tr:hover td { background: #d0dafd; color: #339; }
			
			a { text-decoration:none; color: #669;}
		</style>
	</head>
	<body>
		<input type="button" onclick="window.location.href='index.jsp'"  value="Volver">	
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
				<%  
					Service service = new Service();
					List<Log> listAllLogs = service.listAllLogs(); 
					for (Log log: listAllLogs){
						out.println("<tr>");
							out.println("<td><a href='select?name="+log.getName()+"'>"+ log.getName() +"</a></td>");
							out.println("<td>"+ log.getState() +"</td>");
							out.println("<td>"+ log.getDate() +"</td>");
							out.println("<td>"+ log.getHour() +"</td>");
						out.println("</tr>");
					}
				%>
			</tbody>
		</table>
	</body>
</html>