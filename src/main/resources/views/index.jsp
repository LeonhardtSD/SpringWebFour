<%@page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<!--action的名称对应于@controller的同名方法-->
    <form action="upload" enctype="multipart/form-data" method="post">
        <input type="file" name="file"/>
        <input type="submit" value="上传"/>

    </form>

</body>

</html>