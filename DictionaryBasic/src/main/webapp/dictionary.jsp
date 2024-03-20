<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/03/2024
  Time: 9:55 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%
    Map<String, String> dic = new HashMap<>();
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");
    String search = request.getParameter("search");
    String result = dic.get(search);
%>
<% if (result != null) { %>
<p>Word: <%= search %></p>
<p>Result: <%= result %></p>
<% } else { %>
<p>Not found</p>
<% } %>
</body>
</html>

