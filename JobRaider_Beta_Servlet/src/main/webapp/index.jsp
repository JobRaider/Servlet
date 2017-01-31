<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
	</head>
	<body>
		<h3>Login</h3>
		<form action="login">
			<table width="40%">
				<tr>
					<td>
						<p>Nombre:</p>
					</td>
					<td>
						<input type="text" name="name" />
					</td>
				</tr>
				<tr>
					<td>
						<p>Clave:</p>
					</td>
					<td>
						<input type="password" name="pass" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="login" />
					</td>
				</tr>
			</table>
		</form>
		
		<h3>Insertar usuarios</h3>
		<form action="httpPostServlet">
			<table width="40%">
				<tr>
					<td>
						<p>Nombre:</p>
					</td>
					<td>
						<input type="text" name="name" />
					</td>
				</tr>
				<tr>
					<td>
						<p>Clave:</p>
					</td>
					<td>
						<input type="password" name="pass" />
					</td>
				</tr>
				<tr>
					<td>
						 <p>Dni:</p>
					</td>
					<td>
						 <input type="password" name="dni" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
				 		<input type="submit" value="Insertar" />
				 	</td>
				</tr>
			</table>
		</form>
		
		<h3>Insertar Log</h3>
		<form action="httpPostServletLog">
			<table width="40%">
				<tr>
					<td>
						<p>Nombre:</p>
					</td>
					<td>
						<input type="text" name="name" />
					</td>
				</tr>
				<tr>
					<td>
						<p>Estado:</p>
					</td>
					<td>
						<input type="text" name="est" /> 
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit"value="Insertar Log" />
					</td>
				</tr>
			</table>
		</form>
		
		<br>
		<br>
		<input type="button" onclick="window.location.href='List.jsp'"  value="Mostrar Log">
	</body>
</html>