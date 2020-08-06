<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/doLogin">
    用户名：<input type="Text" name="username" /> <span style="color: red">${errorname}</span><br>
    密码：&nbsp&nbsp&nbsp&nbsp<input type="password" name="password" /><span style="color: red">${errorpasswd}</span><br>
    <input type="submit" value="提交"><a href="${pageContext.request.contextPath}/user/gotoRegister">注册</a>
</form>

</body>
</html>

