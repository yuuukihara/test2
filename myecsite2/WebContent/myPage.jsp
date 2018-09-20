<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>

<s:if test ="mplist == null">
	<h3>ご購入情報ありません。</h3>
</s:if>　
<s:elseif test ="message == null">
	<h3>ご購入情報は以下になります</h3>
	<table border="1">
	<tr>
		<th>商品名</th>
		<th>値段</th>
		<th>購入個数</th>
		<th>支払い方法</th>
		<th>購入日</th>
	</tr>
	<s:iterator value="mplist">
		<tr>
			<td><s:property value="itemName"/></td>
			<td><s:property value="totalPrice"/></td>
			<td><s:property value="totalCount"/></td>
			<td><s:property value="payment"/></td>
			<td><s:property value="insert_date"/></td>
		</tr>
	</s:iterator>
	</table>

	<s:form action="MyPageAction">
		<input type="hidden" name="deleteFlg" value="1">
		<s:submit value="消去" method="delete"/>
	</s:form>
</s:elseif>

<s:if test="message !=null">
	<h3><s:property value="message"/></h3>
</s:if>

<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
<p>ログアウトする場合は<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
</body>
</html>