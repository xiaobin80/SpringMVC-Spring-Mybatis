<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<%@ page session="false" %>
<html>
<head>
	<title>Customer Saved Successfully</title>
</head>
<body>
<h3>
	Customer Saved Successfully.
</h3>

<strong>Customer Name:${customer.name}</strong><br>
<strong>Customer Email:${customer.email}</strong><br>
<strong>Customer Age:${customer.age}</strong><br>
<strong>Customer Gender:${customer.gender}</strong><br>
<strong>Customer Birthday:<fmt:formatDate value="${customer.birthday}" type="date" /></strong><br>

</body>
</html>
