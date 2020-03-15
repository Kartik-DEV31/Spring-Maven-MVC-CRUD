<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<h1>Employee List</h1>
<table border="1" width="50%">

	<tr><th>ID</th><th>Name</th><th>Phone</th></tr>
	<c:forEach var="emp11" items="${emplist}">
	<tr>
	<td>${emp11.employee_ID} </td>
	<td>${emp11.employee_Name} </td>
	<td>${emp11.phone} </td>
	<td><a href="delete/${emp11.employee_Name}">delete</a></td>
	<td>
	<form action="update" method="post"><p>
	Phone :			<input type="text" name="PhoneUpdate"/><br>
	Confirm Name : 	<input type="text" name="Employee_Name"/><br>
				<input type="submit" name="submit" value="Update"></p>
	 </form>
	</td>
	</tr>
	
	</c:forEach>

</table>