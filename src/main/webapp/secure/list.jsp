<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>Username: <c:out value="${user.username}"/></td>
            <td>Nickname: <c:out value="${user.nickname}"/></td>
            <%--<td><fmt:formatDate value="${user.loginDate}" dateStyle="SHORT"/></td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
