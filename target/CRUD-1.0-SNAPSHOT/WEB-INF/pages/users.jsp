<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 17.10.2022
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>USERS</title>
</head>
<body>

<h2>Users</h2>
<table>
    <tr>
        <th>id</th>
        <th>surname</th>
        <th>firstname</th>
        <th>patronymic</th>
        <th>dateOfBirth</th>
        <th>email</th>
        <th>phoneNumber</th>
        <th>action</th>
    </tr>
    <c:forEach var="user" items="${usersList}">
        <tr>
            <td>${user.id}</td>
            <td>${user.surname}</td>
            <td>${user.firstname}</td>
            <td>${user.patronymic}</td>
            <td>${user.dateOfBirth}</td>
            <td>${user.email}</td>
            <td>${user.phoneNumber}</td>
            <td>
                <a href="/update/${user.id}">update</a>
                <a href="/delete/${user.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

<h2>Create</h2>
<c:url value="/create" var="create"/>
<a href="${create}">Create new user</a>
</body>
</html>


