<%@page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="user/add" method="post">
    用户名： <input name="name">${nameError} <br/>
    年龄： <input  name="age">${ageError}<br/>
    电话： <input  name="phone">${phoneError}<br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
