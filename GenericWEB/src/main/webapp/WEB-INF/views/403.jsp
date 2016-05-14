<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Acceso denegado</title>
	</head>
	<body>
		<c:import url="/WEB-INF/views/menu.jsp"/>
		<h2>Lo sentimos, no cuenta con acceso para este contenido. Favor de contactar con el administrador</h2>
		<a href="<c:url value="/logout" />">Logout</a>
	</body>
</html>