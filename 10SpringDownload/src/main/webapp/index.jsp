<%@page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件下载页面</title>
</head>
<body>
<div>

    <img src="/statics/images/wolf.jpg"></a>
    <form action="downloadFile/download">
        <input name="path" value="/statics/images" hidden>
        <input name="fileName" value="wolf.jpg" hidden>
        <input type="submit" value="下载">
    </form>
</div>
</body>
</html>
