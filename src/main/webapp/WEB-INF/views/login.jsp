<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body background="red">
<h1 style="color: red">This is login page</h1>
<form action="${pageContext.request.contextPath}/user/login">

<input type="text" name="username" placeholder="username"> 用户名 ： <br>
<input type="password" placeholder="password"> 密码 ： <br>
<input type="submit" value="提交">

</form>

</body>
</html>