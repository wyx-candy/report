<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交信息</title>
</head>
<body>
	<form action="LoginServlet" method="post">
		<h3>基本信息</h3>
		ID：<input name="id" type="text">
		姓名：<input name="userName" type="text"> <br><br>
		职业：<select id="occupation" name="occupation">
			<option value="student">学生</option>
			<option value="teacher">教师</option>
			<option value="cleaner">清洁工</option>
		</select>
		性别：<select id="sex" name="sex">
			<option value="male">男</option>
			<option value="female">女</option>
		</select>
		学院：<select id="college" name="college">
			<option value="computer">计算机</option>
			<option value="math">数统</option>
			<option value="music">音乐</option>
		</select>
		<br><br>
		是否在湖北：<select id="hubei" name="hubei">
			<option value="yes">是</option>
			<option value="no">否</option>
		</select>
		是否在武汉：<select id="wuhan" name="wuhan">
			<option value="yes">是</option>
			<option value="no">否</option>
		</select>
		
		<h3>健康信息</h3>
		疑似(是/否)：<input name="contact" type="text">
		确诊(是/否)：<input name="confirm" type="text">
		<br><br>
		填报日期(yyyy-mm-dd)：<input name="date" type="text">
		<br><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>