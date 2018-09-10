<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% double result = (double) request.getAttribute("result"); %>
<% String oturi = (String) request.getAttribute("oturi");  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>計算入力</p>

<form action="Keisan" method="post">
	<input type="text" name="keisan" class="input">
	<p><select name="way" class="pull">
		<option value="1">＋</option>
		<option value="2">－</option>
		<option value="3">×</option>
		<option value="4">÷</option>
		<option value="5">平均(入力した値の平均)</option>
		<option value="6">円の面積(半径を入力)</option>
		<option value="7">乱数を取得</option>
		<option value="8">おつりの計算(1,商品の値段,2支払い金額)</option>
</select></p>

<input type="submit" value="計算" class ="sub">

</form><br>

<%if(result != 0.0){ %>
<p>結果は<%= result %></p>
<%}else{ %>
<p>おつりは</p>
<%= oturi %>
<%} %>
</body>
</html>