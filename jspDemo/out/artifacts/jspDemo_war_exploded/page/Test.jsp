<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2024/11/21
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="" uri=""%>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        for(int i=2000;i<=2020;i++)
        {
            if(i%4==0&&i%100!=0||i%400==0){
    %>
                <%=i%>
        <%
                }
            }
        %>
    <%
        out.print(123);
    %>
</body>
</html>
