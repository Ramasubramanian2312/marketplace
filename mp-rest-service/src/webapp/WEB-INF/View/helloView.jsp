<%--
  Created by IntelliJ IDEA.
  User: Abhi
  Date: 2/28/16
  Time: 1:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to my application</title>
</head>
<body>

<h1>Welcome to Spring Mr ${userName}</h1>

The time is now <%= new java.util.Date() %>

<input type="button" onclick="location.href = '/logout';" value="Logout"/>

</body>
</html>
