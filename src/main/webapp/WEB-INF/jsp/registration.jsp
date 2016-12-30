<%--
  Created by IntelliJ IDEA.
  User: saif23
  Date: 11/21/2016
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form:form  method="post" commandName="registration" >
    <table>
        <tr>
            <td>
                <p>First Name</p>
                <form:input path="firstname"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>lastname</p>
                <form:input type="text" path="lastname"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>username</p>
                <form:input type="text" path="username"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Userpassword</p>
                <form:input type="password" path="userpassword"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Userpassword</p>
                <form:input type="file" path="imageFile" name="fileUpload" size="50" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Registration"/>
            </td>
        </tr>

    </table>
</form:form>
<%--



<form:form  method="post" commandName="registration" >
    <table>


        <tr>
            <td>
                <p>First Name</p>
                <form:input type="text" path="firstname"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Last name</p>
                <form:input type="text" path="lastname"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>UserName</p>
                <form:input type="text" path="username"/>
            </td>
        </tr>
        <tr>
            <td>
                <p>Password</p>
                <form:input type="password" path="userpassword"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Login">
            </td>
        </tr>
    </table>
</form:form>
--%>


</body>
</html>
