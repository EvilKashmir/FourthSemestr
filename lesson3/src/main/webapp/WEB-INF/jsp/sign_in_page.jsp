<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Ural
  Date: 04.10.2020
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>SignIn</title>
</head>
<body>
<form method="post" action="/signIn">
  <input placeholder="email" class="input-text" name="email" type="text">
  <input placeholder="password" class="input-text" name="password" type="password">
  <input type="submit">
</form>
</body>
</html>
