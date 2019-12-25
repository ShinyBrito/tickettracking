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
	<form:form action="/details">
		<table>

			<tr>
				<td><label>Flight Name</label></td>
				<td><input name="fightName" /></td>
			</tr>
			<tr>
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
	<c:if test="${passengers!=null}">
		<table>
			<tr>
				<th>Passanger Name</th>
				<th>Travel Date</th>
				<th>Travel Date</th>
				<th>Travel Date</th>
				<th>Preffered Food</th>
				<th>Price</th>
			</tr>
			<c:forEach var="passanger" items="${passengers}">

				<tr>
					<td>${passanger.passangerName}</td>
					<td>${passanger.travelDate}</td>
					<td>${passanger.getHobby()}</td>
					<td>${passanger.foodType}</td>
					<td>${passanger.flightPrice}</td>
					<td><a href="/update/${passanger.passangerID}">update</a></td>
				</tr>

			</c:forEach>
		</table>
	</c:if>
</body>
</html>