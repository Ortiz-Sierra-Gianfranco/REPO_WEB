<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>APP 001</title>
</head>
<body>
	<h1>Operaciones</h1>
	<form method="post	" action="MateServlet">
		<table>
			<tr>

				<td>Operación</td>
				<td><select name="opera">
						<option value=1>Suma</option>
						<option value=2>Producto</option></td>
				</select>
			</tr>
			<tr>
				<td>Número 1:</td>
				<td><input type=text name=n1></td>
				<td><input type=text name=n2></td>
			</tr>
		</table>
		<input type=submit name=procesar value=Enviar>
	</form>
</body>
</html>