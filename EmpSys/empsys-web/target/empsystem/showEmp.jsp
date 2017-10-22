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
	<h2>员工信息列表</h2>
	<div>
		<s:if test="msg==1">
			<p style="color:green">操作成功!</p>
		</s:if>
		<s:elseif test="msg==-1">
			<p style="color:red">操作失败!</p>
		</s:elseif>
	</div>
	<table border="1" width="850">
	<tr>
	<td>编号</td><td>部门名称</td>
	<td>员工姓名</td><td>年龄</td>
	<td>性别</td><td>管理</td>
	</tr>
	<s:iterator value="#request.empList" var="e" status="ids">
		<tr>
		<td>${ids.count }</td><td>${e[1].dname}</td>
		<td>${e[0].ename}</td><td>${e[0].eage}</td>
		<td>${e[0].esex}</td>
		<td>
			&nbsp;<a href="empAction_deleteEmp?emp.eno=${e[0].eno}">删除</a>&nbsp;|
			<a href="empAction_toUpdateEmp?emp.eno=${e[0].eno}">修改</a>
		</td>
		</tr>
	</s:iterator>
	</table>
	<a href="index.jsp">返回菜单列表</a>
</body>
</html>