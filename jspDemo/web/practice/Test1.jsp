<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/11/21
  Time: 12:05
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
    String sex = request.getParameter("sex");
    String year = request.getParameter("year");
    String month = request.getParameter("month");
    String day = request.getParameter("day");
    String[] aihaos = request.getParameterValues("aihao");
%>
        <table>
            <tr>
                <td>用户名</td>
                <td><%out.print(username);%></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><%out.print(password);%></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><%out.print(sex);%></td>
            </tr>
            <tr>
                <td>出生日期</td>
                <td><%out.print(year+"年"+month+"月"+day+"日");%></td>
            </tr>
            <tr>
                <td>爱好</td>
                <td><%
                    for(String a:aihaos)
                        out.print(a);%></td>
            </tr>
        </table>
</body>
</html>
