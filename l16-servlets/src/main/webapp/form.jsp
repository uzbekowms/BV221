<%--
  Created by IntelliJ IDEA.
  User: teacher
  Date: 19.08.2024
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/users" method="GET">
    <label for="firstName">Ім'я:</label>
    <input type="text" id="firstName" name="firstName" required>
    <br><br>
    <label for="lastName">Фамілія:</label>
    <input type="text" id="lastName" name="lastName" required>
    <br><br>
    <button type="submit">Відправити</button>
</form>
</body>
</html>
