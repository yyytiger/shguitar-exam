<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="sf"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>

<form method="post" action="/user">
    Username:<input type="text" name="username"/>
    Password:<input type="password" name="password"/>
    Nickname:<input type="text" name="nickname"/>
    Email<input type="text" name="email"/>
    <input type="submit" value="添加用户" />

</form>
</body>
</html>