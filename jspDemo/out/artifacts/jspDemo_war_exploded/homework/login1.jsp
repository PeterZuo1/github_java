<%@ page import="pojo.User" %>
<%@ page import="impl.loginImpl" %>
<%@ page import="Dao.loginDao" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/11/21
  Time: 14:51
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
    String password = request.getParameter("password");
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);
    loginDao login = new loginImpl();
    System.out.println(user.getUsername());
    System.out.println(user.getPassword());
    boolean login1 = login.Login(user);
    if(login1)
        request.getRequestDispatcher("first.jsp").forward(request,response);
    else
        request.getRequestDispatcher("over.jsp").forward(request,response);
%>
</body>
</html>
