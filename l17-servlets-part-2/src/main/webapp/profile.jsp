<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date, java.util.Scanner" %>
<%@ page import="java.util.Date, java.util.Scanner" pageEncoding="utf-8" %>
<%@ page errorPage="error.jsp" %>
<%

    String header = "Lesson about Servlets";
%>
<%!
    public int square(int n) {
        return n * n;
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="WEB-INF/components/header.jsp" %>
<%
    String[] people = {"Petro", "Oleg", "Ivan"};
%>
<%= header %>
Today <%= new Date() %>
<p>2 + 2 = <%= 2 + 2 %>
</p>
<p>2 * 5 = <%= 2 * 5 %>
</p>
<div>
    <ul>
        <%
            session.getAttribute("name");
            class UserService {
                public void doSomething() {
                    System.out.println("Hello");
                }
            }

            for (int i = 0; i < 10; i++) {
                out.println("<li>" + square(i) + "</li>");
            }
            for (String human : people) {
                out.println("<li>" + human + "</li>");
            }
            UserService userService = new UserService();
            userService.doSomething();
        %>
    </ul>
</div>
</body>
</html>
