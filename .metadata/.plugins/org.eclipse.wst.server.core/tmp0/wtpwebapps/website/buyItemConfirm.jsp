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

<table>
	<s:form action ="UserCreateCompleteAction">
		<tr>
			<td>
				<label>商品名:</label>
			</td>
			<td>
				<s:property value="session.buyItem_name"/>
			</td>
		</tr>

		<tr>
			<td>
				<label>値段:</label>
			</td>
			<td>
				<s:property value="session.total_price"/>
			</td>
		</tr>

		<tr>
			<td>
				<label>個数:</label>
			</td>
			<td>
				<s:property value="session.count"/>
			</td>
		</tr>
		<tr>
			<td>
				<label>支払い方法</label>
			</td>
			<td>
				<s:property value="session.pay"/>
			</td>
		</tr>

		<s:submit value="登録完了"/>

	</s:form>
</table>

</body>
</html>