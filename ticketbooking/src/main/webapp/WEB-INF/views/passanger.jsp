<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
        function validate() {
        	
            var name = document.getElementById("passangerName").value;
            if (name.length < 7 || name.length > 14) {
                alert("Enter valid name");
                return false;
            }
             var letters = /^[a-zA-Z]+$/;
                if (!name.match(letters)) {
                    alert('Name  must have  characters only');
                    return false;
                }
                
                var chks1 = document.getElementById('Hobby1').checked;
                var chks2 = document.getElementById('Hobby2').checked;
                var chks3 = document.getElementById('Hobby3').checked;
                var chks4 = document.getElementById('Hobby4').checked;
             var  count=0; 
                if(chks1==true){
                	count++;

                }
                if(chks2==true){
                	count++;
                }
                if(chks3==true){
                	count++;
                }
                if(chks4==true){
                	count++;
                }
             if(count<2){
            	 alert("check atleast 2 boxes!!" );
            	 return false;
             }
                
                
                var r1 = document.getElementById('rad1').checked
                var r2 = document.getElementById('rad2').checked;
                if ((r1 == false) && (r2 == false)) {
                    alert("select food type");
                    return false;

                }
                
        
           
            return true;
        }
    </script>
</head>
<body>
	<form:form action="/passanger">
		<table>
			<tr>
				<td><label>Flights</label></td>
				<td><select name="flightID">
						<c:forEach var="flight" items="${flights}">
							<option value="${flight.flightID}">${flight.fightName}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td><label>Passanger Name</label></td>
				<td><form:input path="passangerName" id="passangerName" /></td>
			</tr>
			<tr>
				<td><label>Travel Date</label></td>
				<td><form:input path="travelDate" type="date" /></td>
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
		<input type="submit" onclick="return validate()">


	</form:form>
</body>
</html>