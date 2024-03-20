<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Simple Calculator</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="CalculateServlet" method="post">
  Operand 1: <label>
  <input type="number" name="operand1">
</label><br/>
  Operand 2: <label>
  <input type="number" name="operand2">
</label><br/>
  Operator:
  <select name="operator">
    <option value="add">Addition (+)</option>
    <option value="subtract">Subtraction (-)</option>
    <option value="multiply">Multiplication (*)</option>
    <option value="divide">Division (/)</option>
  </select><br/>
  <input type="submit" value="Calculate">
</form>
</body>
</html>