<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/03/2024
  Time: 4:31 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculation Result</title>
</head>
<body>
    <c:choose>
        <c:when test="${errorMessage != null}">
            <h2>Error1111: ${errorMessage}</h2>
        </c:when>
        <c:otherwise>
            <h2>Result1111: ${result}</h2>
        </c:otherwise>
    </c:choose>

</body>
</html>
