<%--
  Created by IntelliJ IDEA.
  User: saif23
  Date: 11/9/2016
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<form:form action="student.do" commandName="Student" method="post">
    <table>
        <tr>
            <td><p>Id: <form:input path="id"/></p></td>
        </tr>

        <tr>
            <td><p>FirstName: <form:input path="firstname"/></p></td>
        </tr>

        <tr>
            <td><p>LastName: <form:input path="lastname"/></p></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" name="add" value="Add">
                <input type="submit" name="edit" value="Edit">
                <input type="submit" name="delete" value="Delete">
                <input type="submit" name="search" value="Search">
            </td>
        </tr>

    </table>
</form:form>
<br>
<br>

<table>
    <tr>
        <td>ID</td>
        <td>FirstName</td>
        <td>LastName</td>
    </tr>

    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.firstname}</td>
            <td>${student.lastname}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
