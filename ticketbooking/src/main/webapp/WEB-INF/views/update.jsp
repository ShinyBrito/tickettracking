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
	<form:form action="/updatetraveldate/${passanger.passangerID}">
		<table>


			<tr>
				<td><label>Passanger Name</label></td>
				<td><form:input path="passangerName" id="passangerName"
						value="${passanger.passangerName}" /></td>
			</tr>
			<tr>
				<td><label>Travel Date</label></td>
				<td><form:input path="travelDate" type="date"
						value="${passanger.travelDate}" /></td>
			</tr>
			<tr>
				<td><label>Hobby </label></td>
				<td><form:checkbox id="Hobby1" path="Hobby" value="singing" />singing
					<form:checkbox path="Hobby" id="Hobby2" value=" dancing" />dancing
					<form:checkbox path="Hobby" id="Hobby3" value="reading" />reading
					<form:checkbox path="Hobby" id="Hobby4" value="cooking" />cooking</td>
			</tr>
			<tr>
				<td><label>Preffered Food </label></td>
				<td><form:radiobutton path="foodType" value="veg" id="rad1" />veg
					<form:radiobutton path="foodType" value="non-veg" id="rad2" />non-veg</td>
			</tr>



		</table>
		<input type="submit">


	</form:form>
</body>
</html>