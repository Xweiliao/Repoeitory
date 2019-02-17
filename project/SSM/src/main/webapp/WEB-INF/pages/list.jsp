<%--
  Created by IntelliJ IDEA.
  User: WEI
  Date: 2018/12/8
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有的账户</h3>
    <table border="1px" cellpadding="0" cellspacing="0">
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>金额</td>
        </tr>
        <c:forEach items="${list}" var="account">
            <tr>
                <td>${account.id}</td>
                <td>${account.name}</td>
                <td>${account.moeny}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
