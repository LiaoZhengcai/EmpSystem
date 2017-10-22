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
	<h2>添加员工信息</h2>
	<div>
		<s:if test="#parameters.msg[0]==1">
			<p style="color:green">添加员工成功!</p>
		</s:if>
		<s:elseif test="#parameters.msg[0]==-1">
			<p style="color:red">添加员工失败!</p>
		</s:elseif>
	</div>
	<s:form method="post" action="empAction_addEmp">
	员工姓名:<s:textfield name="emp.ename"/><br/>
	员工年龄:<s:textfield name="emp.eage"/><br/>
	员工性别:<s:radio list="{'男','女'}" name="emp.esex" value="%{'男'}"/><br/>
	选择部门:<select name="emp.dept.dno">
				<option value="">请选择部门</option>
			 </select><br/>
			 <s:submit value="添加员工"/>
	</s:form>
	<a href="index.jsp">返回菜单列表</a>
</body>
</html>
<script type="text/javascript">
$(function(){
	//取出所有可选的部门
	$(":input[name='emp.dept.dno'] option:not(:first)").remove();
	$.post("empAction_findDeptList",null,function(data){
		$.each(data.deptList,function(i,v){
			var option="<option value='"+v.dno+"'>"+v.dname+"</option>";
			$(":input[name='emp.dept.dno']").append(option);
		});
	},"json");
});
</script>
