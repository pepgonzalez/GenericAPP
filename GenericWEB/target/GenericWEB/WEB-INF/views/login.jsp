<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>GenericAPP | Iniciar Sesion</title>
	</head>
	<body>
		<h2>Bienvenido</h2>
		<c:url var="loginUrl" value="/j_spring_security_check"/> 
		<form action="${loginUrl}" name="f" method="POST">
			<table>
				<tr>
					<td>Usuario:</td>
					<td><input type="text" name="j_username" value=""></td>
				</tr>
				
				<tr>
					<td>Contraseña:</td>
					<td><input type="password" name="j_password" value=""></td>
				</tr>
				
				<tr>
					<td><input type="submit" name="submit" value="Iniciar Sesion"></td>
				</tr>
				
			</table>
		</form>
	</body>
</html>