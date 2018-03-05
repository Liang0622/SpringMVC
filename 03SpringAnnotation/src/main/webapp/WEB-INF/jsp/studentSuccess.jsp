<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/4
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
学生姓名：${userName}
学生年龄： ${age}  <br/>
<hr/>


学生姓名：${student.name}
学生年龄： ${student.age}  <br/>
teacher姓名：${student.teacher.name}
teacher年龄： ${student.teacher.age}  <br/>

</body>
</html>
