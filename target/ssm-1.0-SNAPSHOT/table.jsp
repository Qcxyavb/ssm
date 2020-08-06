<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% int sum=8; %>


    <table border="1" width="400" >
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
        </tr>
        <%
            for (int i = 1; i <sum ; i++) {
                out.println("<th>"+i+"</th>");
            }
        %>
        <tr>
            <th>1</th>
            <th>cly</th>
            <th>nan</th>
        </tr>
        <tr>
            <th>2</th>
            <th>larry</th>
            <th>nan</th>
        </tr>
    </table>
</body>
</html>
