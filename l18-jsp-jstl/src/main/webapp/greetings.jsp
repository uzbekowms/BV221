<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
    <style>
        .first-class{
            background-color: red;
        }
        .default-class{
            background-color: aqua;
        }
    </style>
</head>
<body>
<%--${requestScope.message}--%>
Hello
<c:out value="${message}" default="No message"/>
<c:if test="${param.isAdmin}">
    <div>
        Admin
    </div>
</c:if>
<hr>
<p>You</p>

<c:choose>
    <c:when test="${param.role == 'admin'}">
        <c:import url="WEB-INF/admin.jsp"/>
    </c:when>
    <c:when test="${param.role == 'user'}">
        User page
    </c:when>
    <c:otherwise>
        Not authenticated
    </c:otherwise>
</c:choose>
<hr>
<ul>
    <c:forEach begin="0" end="21" var="i">
        <li>${i}</li>
    </c:forEach>
</ul>
<hr>
<ul>
    <c:forEach items="${users}" var="user" varStatus="info">
        <li class="${info.first ? 'first-class' : 'default-class'}">${info.count} ${info.index} ${user.getFormatted()} ${info.first} ${info.index} ${info.last}</li>
    </c:forEach>
</ul>

</body>
</html>
