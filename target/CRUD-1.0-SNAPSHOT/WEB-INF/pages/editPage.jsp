<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 17.10.2022
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Update</title>
  <c:if test="${empty user.surname}">
    <title>Create</title>
  </c:if>
  <c:if test="${!empty user.surname}">
    <title>Update</title>
  </c:if>
</head>
<body>
<c:if test="${empty user.surname}">
  <c:url value="/create" var="var"/>
</c:if>
<c:if test="${!empty user.surname}">
  <c:url value="/update" var="var"/>
</c:if>
<form action="${var}" method="POST">
  <c:if test="${!empty user.surname}}">
    <input type = "hidden" name = "id" value="${user.id}">
  </c:if>
  <label for="surname">surname</label>
  <input type="text" name="surname" id="surname">
  <label for="firstname">firstname</label>
  <input type="text" name="firstname" id="firstname">
  <label for="patronymic">patronymic</label>
  <input type="text" name="patronymic" id="patronymic">
  <label for="dateOfBirth">dateOfBirth</label>
  <input type="text" name="dateOfBirth" id="dateOfBirth">
  <label for="email">email</label>
  <input type="text" name="email" id="email">
  <label for="phoneNumber">phoneNumber</label>
  <input type="text" name="phoneNumber" id="phoneNumber">
  <c:if test="${empty user.surname}">
    <input type="submit" value="Create new user">
  </c:if>
  <c:if test="${!empty user.surname}">
    <input type="submit" value="Update user">
  </c:if>
</form>
</body>
</html>