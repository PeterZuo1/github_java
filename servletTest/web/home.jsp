<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/11/28
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1 align="center">首页</h1>
<table align="center" border="1" width="500px">
    <tr>
        <td>序号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>操作</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${user1}" var="user" varStatus="vs">
        <tr><td>${vs.count}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td><a href="#">删除</a> </td>
            <td><a href="#">修改</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
