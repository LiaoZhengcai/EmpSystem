<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<h2>修改员工信息</h2>
	<s:form method="post" action="empAction_doUpdateEmp">
		  <s:hidden name="emp.eno"/>
	员工姓名:<s:textfield name="emp.ename"/><br/>
	员工年龄:<s:textfield name="emp.eage"/><br/>
	员工性别:<s:radio list="{'男','女'}" name="emp.esex"/><br/>
	选择部门:<s:select list="#request.deptList" name="emp.dept.dno" headerKey="" headerValue="请选择部门" listKey="dno" listValue="dname"/>
		<s:submit value="确认修改"/>
	</s:form>
	<a href="index.jsp">返回菜单列表</a>
</body>
</html>
