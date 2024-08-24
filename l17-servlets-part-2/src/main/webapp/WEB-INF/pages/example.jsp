<%--
  Created by IntelliJ IDEA.
  User: teacher
  Date: 23.08.2024
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%
    pageContext.setAttribute("name", "Tom");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${sessionScope.name}
${users[1]}
<p>Result: ${result}
</p>
<p>User: ${user} </p>
</body>
</html>
