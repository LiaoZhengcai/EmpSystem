<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>部门信息列表</h2>
	<table id="tab" border="1" width="300" style="text-align: center;">
		<tr>
			<td>编号</td><td>部门名称</td>
			<td>管理</td>
		</tr>
		<s:iterator value="#request.deptList" var="d" status="ids">
			<tr>
			<td>${ids.count }</td><td>${d.dname }</td>
			<td>
				&nbsp;<a href="">删除</a>&nbsp;|
				<a href="">修改</a>
			</td>
		</tr>
		</s:iterator>
	</table>
	<a href="index.jsp">返回功能列表</a>
</body>
</html>