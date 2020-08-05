<%@ page import="com.qf.mybatis.pojo.Emp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Emp</title>
</head>
<body>
<%
    Emp emp = (Emp)request.getAttribute("emp");
    response.getWriter().println(emp.getName());
%>
</body>
</html>