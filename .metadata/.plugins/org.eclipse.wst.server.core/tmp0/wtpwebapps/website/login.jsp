<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>

<h3>商品を購入するにはログインが必要です。</h3>

<s:form action ="LoginAction">
	<s:textfield name="loginId"/>
	<s:password name="loginPass"/>
	<s:submit value="ログイン"/>
</s:form>

<p>
	新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a>
</p>
</body>
</html>