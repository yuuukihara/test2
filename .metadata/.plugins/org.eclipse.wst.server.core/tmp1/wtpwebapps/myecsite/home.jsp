<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>home</title>
</head>
<body>

<s:form action="HomeAction">
	<s:submit value="商品購入"/>
</s:form>
<s:if test="#session.id != null">
	<p>ログアウトする場合は<a href="<s:url action='LogoutAction'/>">こちら</a></p>
</s:if>

</body>
</html>