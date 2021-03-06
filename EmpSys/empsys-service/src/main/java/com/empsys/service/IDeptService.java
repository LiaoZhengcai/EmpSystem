package com.empsys.service;

import java.util.List;
import com.empsys.entity.TbDept;
/**
 * 部门service接口
 * @author admins
 *
 */
public interface IDeptService {

	//添加部门的方法
	public boolean addDept(TbDept dept);
	//删除部门的方法
	public boolean deleteDept(TbDept dept);
	//修改部门信息的方法
	public boolean updateDept(TbDept dept);
	//查询部门信息的方法
	public List findDeptList();
	//根据id查询部门信息的方法
	public TbDept getDeptById(int dno);
}
