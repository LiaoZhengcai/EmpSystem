<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加部门</h2>
	<div>
		<s:if test="#parameters.msg[0]==1">
			<p style="color:green">添加部门成功!</p>
		</s:if>
		<s:elseif test="#parameters.msg[0]==-1">
			<p style="color:red">添加部门失败!</p>
		</s:elseif>
	</div>
	<s:form method="post" action="deptAction_addDept">
		部门名称：<s:textfield name="dept.dname"/>&nbsp;
			  <s:submit value="确认添加"/>
	</s:form>
	<a href="deptAction_findDeptList">返回部门信息列表</a>
</body>
</html>