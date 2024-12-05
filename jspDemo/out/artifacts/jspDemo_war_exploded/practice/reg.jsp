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
<form action="Test1.jsp" method="post">
    <p>用户名：<input type="text" name="username"></p>
    <P>密码:<input type="password" name="password"></P>
    <p>重复输入密码：<input type="password" name="password1"></p>
    <p>
        性别:<input type="radio" name="sex" value="男">男
        <input type="radio" name="sex" value="女">女
    </p>
    <%--<input type="date">日期--%>
    <p >
        出生日期
        <select name="year">
            <option value="2000">2000 </option>
            <option value="2001">2001 </option>
            <option value="2002">2002 </option>
            <option value="2003">2003 </option>
            <option value="2004">2004 </option>
        </select>年
        <select name="month">
            <option value="1">1 </option>
            <option value="2">2 </option>
            <option value="3">3 </option>
            <option value="4">4 </option>
            <option value="5">5 </option>
            <option value="6">6 </option>
            <option value="7">7 </option>
            <option value="8">8 </option>

        </select>月
        <select name="day">
            <option value="1">1 </option>
            <option value="2">2 </option>
            <option value="3">3 </option>
            <option value="4">4 </option>
            <option value="5">5 </option>
            <option value="24">24 </option>
        </select>日
    </p>
    <p>爱好：<input type="checkbox" name="aihao" value="唱歌">唱歌
        <input type="checkbox" name="aihao" value="跳舞">跳舞
    </p>
    <input type="submit" value="提交">
</form>
</body>
</html>
