package com.empsys.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.empsys.entity.TbDept;
import com.empsys.service.IDeptService;
import com.opensymphony.xwork2.ActionContext;

/**
 * 部门信息action
 * @author admins
 *
 */
@Controller("deptAction")
@Scope("prototype")
public class DeptAction {

	private TbDept dept;
	private int msg;
	
	//声明需要引用的service
	@Resource(name="deptService")
	private IDeptService deptService;
	
	//添加班级新信息的方法
	public String addDept(){
		if(deptService.addDept(dept)){
			msg=1;
		}else{
			msg=-1;
		}
		return "addDept";
	}
	//查询班级信息的方法
	public String findDeptList(){
		List list = deptService.findDeptList();
		ActionContext.getContext().put("deptList", list);
		return "showDept";
	}
	
	public TbDept getDept() {
		return dept;
	}
	public void setDept(TbDept dept) {
		this.dept = dept;
	}
	public int getMsg() {
		return msg;
	}
	public void setMsg(int msg) {
		this.msg = msg;
	}
	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
	
}
