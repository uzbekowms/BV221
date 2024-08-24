<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<%--<p>Name: ${param.name}</p>--%>
<p>Name: ${paramValues.name[0]}</p>
<p>Name: ${paramValues.name[1]}</p>
<p>Age: ${param.age}</p>
<p>Age: ${cookie.JSESSIONID.value}</p>
<p>Header: ${header['User-Agent']}</p>
<p>Header: ${header.host}</p>
<c:out value="${name}"/>
</body>
</html>
