<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/4
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--01.传递参数 后台接收对应的userName属性--%>
<form action="student/add" method="post">
    用户名：<input name="userName">
    密码：<input name="age">
    <input type="submit" value="注册">
</form>

<%--02.传递对象参数，后台使用对应的对象的属性名--%>
<form action="student/addStudent" method="post">
    用户名：<input name="name">
    年龄：<input name="age">
    <%--teacher就是student类中的域属性--%>
    老师姓名：<input name="teacher.name">
    老师年龄：<input name="teacher.age">
    <input type="submit" value="注册">
</form>

</body>
</html>
