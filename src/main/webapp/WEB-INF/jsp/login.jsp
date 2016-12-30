<%--
  Created by IntelliJ IDEA.
  User: saif23
  Date: 11/8/2016
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<h2>Hello Bro </h2>


<div class="container">


    <div class="row">

        <div class="col-md-3"></div>

        <div class="col-md-6 " style="background-color: #E7E7E7">

            <br>
            <br>
            <div class="col-md-2"></div>
            <div class="col-md-7">
                <form:form class="form-online" method="post" action="/login" commandName="login">

                    <table>
                        <tr>
                            <td>
                                <p>UserName</p>
                            </td>
                            <td>
                                <form:input class="form-control" path="username" placeholder="User Name"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <p>Password</p>
                            </td>
                            <td>
                                <form:input class="form-control" type="password" path="userpassword"
                                            placeholder="********"/>
                            </td>
                        </tr>
                        <tr>
                            <td><br></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td colspan="2">
                                <input class="btn btn-primary" type="submit" value="Login">
                                <a class="btn btn-primary" href="/registration">Sign Up</a>
                            </td>
                        </tr>
                    </table>
                </form:form>
            </div>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
</body>
</html>
