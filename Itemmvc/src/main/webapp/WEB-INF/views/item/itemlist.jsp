<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSTL Core 기능 사용 설정 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- EL을 사용하기 위한 설정으로 없어도 되는 경우가 많지만 간혹 EL을 가지고 출력이 안되는
경우가 있어서 설정 -->
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Item 리스트 출력</title>
<!-- 웹에서 링크 설정은 주소를 기준으로 합니다. 파일의 위치가 아닙니다. -->
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<%-- ${list } --%>
<div align="center" class="body">
<h2>상품 목록 화면</h2>
<table border="1">
<tr class="header">
<th align="center" width="80">상품ID</th>
<th align="center" width="320">상품명</th>
<th align="center" width="100">가격</th>
</tr>
<c:forEach var="item" items="${list}">
<tr class="record">
<td align="center">${item.itemid}</td>
<!-- 파라미터로 만드는법 -->
<%-- <td align="left"><a href="getitem?itemid=${item.itemid}">${item.itemname}</a></td> --%>
<!-- 요즘 사용하는 형태 -->
<td align="left"><a href="getitem/${item.itemid}">${item.itemname}</a></td>
<td align="right">${item.price}원</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>