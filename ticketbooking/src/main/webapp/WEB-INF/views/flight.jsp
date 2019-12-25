<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>
	<form:form action="/flights">
		<table>

			<tr>
				<td><label>Flight Name</label></td>
				<td><form:input path="fightName" /></td>
			</tr>
			<tr>
				<td><label>Source </label></td>
				<td><form:input path="Source" /></td>
			</tr>
			<tr>
				<td><label>Destination </label></td>
				<td><form:input path="Destination" /></td>
			</tr>
			<tr>
				<td><label>Destance </label></td>
				<td><form:input path="Distance" /></td>
			</tr>


		</table>
		<input type="submit">


	</form:form>

</body>
</html>