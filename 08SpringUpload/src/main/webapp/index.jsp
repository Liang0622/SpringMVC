<%@page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="user/add" method="post" enctype="multipart/form-data">
    <%--单文件上传--%>
    <%--<input type="file" name="file">--%>

    <input type="file" name="files">
    <input type="file" name="files">
    <input type="file" name="files">

    <button type="submit">文件上传</button>

</form>
</body>
</html>
