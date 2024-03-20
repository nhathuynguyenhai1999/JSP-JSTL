<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h2>Customer List</h2>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.name}" /></td>
            <td><c:out value="${customer.dateOfBirth}" /></td>
            <td><c:out value="${customer.address}" /></td>
            <td><img src="${customer.imageUrl}" width="100" height="100" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

