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

<s:form action= "BuyItemCompleteAction">

	<tr>
		<td>商品名</td>
		<td><s:property value="session.buyItem_name"/></td>
	</tr>

	<tr>
		<td>値段</td>
		<td><s:property value="session.total_price"/>円</td>
	</tr>

	<tr>
		<td>購入個数</td>
		<td><s:property value="session.count"/></td>
	</tr>

	<tr>
		<td>支払い方法</td>
		<td><s:property value="session.pay"/></td>
	</tr>

	<tr>
		<td><a href='<s:url action="HomeAction"/>'>戻る</a></td>
		<td><s:submit value="完了"/></td>
	</tr>


</s:form>

		<p>前の画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>

</body>
</html>