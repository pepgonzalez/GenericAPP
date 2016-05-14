<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<h2>Menu</h2>
<sec:authorize access="!isAuthenticated()">
	Por favor inicie sesion
	<a href="<c:url value="/login" />">Acceder</a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal" var="principal"/>
	Bienvenido: <c:out value="${principal.username}"/>
	<a href="<c:url value="/logout" />">Logout</a>
</sec:authorize>