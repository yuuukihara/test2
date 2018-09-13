<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>

<s:form action="BuyItemConfirmAction">

<table>
	<tr>
		<td>商品名</td>
		<td><s:property value="session.buyItem_name"/></td>
	</tr>
	<tr>
		<td>値段</td>
		<td><s:property value="session.buyItem_price"/></td>
	</tr>
	<tr>
		<td>購入個数</td>
		<td><s:property value="session.stock"/></td>
	</tr>
	<tr>
		<td>支払い方法</td>
		<td><s:property value="session.pay"/></td>
	</tr>
	<tr>
		<td><s:submit value="完了"/></td>
	</tr>
</table>

</s:form>

</body>
</html>