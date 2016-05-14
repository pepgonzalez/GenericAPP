<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>GenericAPP | Iniciar Sesion</title>
	</head>
	<body>
		<c:import url="/WEB-INF/views/menu.jsp"/>
		<h2>Bienvenido</h2>
		<c:if test="${param.error != null }">
			<span style="border:solid red 1px;">Error de credenciales!</span>
		</c:if>
		<c:if test="${param.exit != null }">
			<span style="border:solid green 1px;">Session Cerrada exitosamente</span>
		</c:if>
		<c:url var="loginUrl" value="/login"/> 
		<form action="${loginUrl}" name="f" method="POST">
		<input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />
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