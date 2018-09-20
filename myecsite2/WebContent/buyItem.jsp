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


<s:form action="BuyItemAction">
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
		<td>
			<select name="count">
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>支払い方法</td>
		<td>
			<input type="radio" name="pay" value="1">現金
			<input type="radio" name="pay" value="2">クレジットカード
		</td>
	</tr>

	<tr>
		<td><s:submit value="購入"/></td>
	</tr>

</table>
</s:form>

<p>前のページに戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>



</body>
</html>