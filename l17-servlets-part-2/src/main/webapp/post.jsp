<%--
  Created by IntelliJ IDEA.
  User: teacher
  Date: 23.08.2024
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>First name: <%= request.getParameter("firstName")%>
</p>
<p>Last name: <%= request.getParameter("lastName")%>
</p>
</body>
</html>
