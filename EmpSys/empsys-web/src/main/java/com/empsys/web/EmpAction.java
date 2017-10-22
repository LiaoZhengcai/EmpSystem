package com.empsys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.empsys.entity.TbEmp;
import com.empsys.service.IDeptService;
import com.empsys.service.IEmpService;
import com.opensymphony.xwork2.ActionContext;
/**
 * 员工信息action
 * @author admins
 *
 */
@Controller("empAction")
@Scope("prototype")
public class EmpAction {

	private TbEmp emp;
	private int msg;
	private List deptList;
	
	//声明需要引用的service
	@Resource(name="deptService")
	private IDeptService deptService;
	@Resource(name="empService")
	private IEmpService empService;
	
	//添加员工
	public String addEmp(){
		if(empService.addEmp(emp)){
			msg=1;
		}else{
			msg=-1;
		}
		return "addEmp";
	}
	//异步查询部门信息的方法
	public String findDeptList(){
		deptList = deptService.findDeptList();
		return "showDept";
	}
	
	//查询员工信息的方法
	public String findEmpList(){
		List list = empService.findEmpList();
		ActionContext.getContext().put("empList", list);
		return "empList";
	}
	//去到修改员工信息页面
	public String toUpdateEmp(){
		emp = empService.getEmpById(emp.getEno());
		List list = deptService.findDeptList();
		ActionContext.getContext().put("deptList", list);
		return "toUpdate";
	}
	//执行修改的方法
	public String doUpdateEmp(){
		if(empService.updateEmp(emp)){
			msg=1;
		}else{
			msg=-1;
		}
		return "doUpdate";
	}
	//删除学生信息的方法
	public String deleteEmp(){
		if(empService.deleteEmp(emp)){
			msg=1;
		}else{
			msg=-1;
		}
		return "deleteEmp";
	}
	
	public TbEmp getEmp() {
		return emp;
	}
	public void setEmp(TbEmp emp) {
		this.emp = emp;
	}
	public int getMsg() {
		return msg;
	}
	public void setMsg(int msg) {
		this.msg = msg;
	}
	public List getDeptList() {
		return deptList;
	}
	public void setDeptList(List deptList) {
		this.deptList = deptList;
	}
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}
	
}
