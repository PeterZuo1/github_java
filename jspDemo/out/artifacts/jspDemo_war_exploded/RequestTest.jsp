<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/11/21
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    String username = request.getParameter("username");
    out.print(username);
%>
</body>
</html>
