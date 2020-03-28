<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		<h3>登录界面</h3>
		<select id="type" name="type">
			<option value="ordinary">普通用户</option>
			<option value="department">部门负责人</option>
			<option value="school">学校负责人</option>
		</select>
		<br><br>
		账号：<input name="userName" type="text"> <br>
		密码：<input name="password" type="password"> <br>
		<input type="submit" value="提交">
	</form>
</body>
</html>