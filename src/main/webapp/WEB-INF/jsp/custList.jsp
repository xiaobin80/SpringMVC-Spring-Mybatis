<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer List Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<table border="1">	
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>Age</th>
		<th>Gender</th>
		<th>birthday</th>
		</tr>

		<c:forEach var="myData" items="${customers}">
			<tr>
			<td>
				<c:out value="${myData.id}" />
			</td>
			<td>
				<c:out value="${myData.name}" />
			</td>
			<td>
				<c:out value="${myData.email}" />
			</td>
			<td>
				<c:out value="${myData.age}" />
			</td>	
			<td>
				<c:out value="${myData.gender}" />
			</td>
			<td>
				<c:out value="${myData.birthday}" />
			</td>												
			</tr>
		</c:forEach>
	</table>

</body>
</html>