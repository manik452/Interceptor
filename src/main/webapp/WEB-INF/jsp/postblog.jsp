<%--
  Created by IntelliJ IDEA.
  User: saif23
  Date: 11/21/2016
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<html>
<head>
    <title>Blog</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<br> <br>

<div class="container">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            <form:form class="form-inline" action="/user/postyourblog" method="post" commandName="UserBlog">
                <table>

                    <tr>
                        <td>
                            <label>User Id:</label>
                        </td>
                        <td>
                            <form:input class="form-control" path="user_id" placeholder="User ID"/>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <label>Blog Id:</label>
                        </td>
                        <td>
                            <form:input class="form-control" path="commentID" placeholder="Blog Id"/>
                        </td>
                    </tr>

                    <%--<tr>
                        <td>
                            <label>Date:</label>
                            <form:input class="form-control" path="postDate"/>
                        </td>
                    </tr>--%>

                    <tr>
                        <td>
                            <label>Heading:</label>
                        </td>
                        <td>
                            <form:input type="text" class="form-control" path="subjectOfComment" placeholder="Heading"/>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <label>Description:</label>
                        </td>
                        <td>
                            <form:textarea type="text" class="form-control" path="DescriptionOfComment" placeholder="Description"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Commit"/>
                        </td>
                    </tr>
                </table>
            </form:form>
        </div>
    </div>
    <div class="col-md-3"></div>
</div>
</body>
</html>
