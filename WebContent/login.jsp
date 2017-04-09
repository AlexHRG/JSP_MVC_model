<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP login</title>
</head>
<body>

<br/>
<form action="/JSP_MVC_model/validator" method="post">
Login: <input type="text" name="login">
Password: <input type="password" name="password">
<input type="submit" value="submit">
</form>

</body>
</html>