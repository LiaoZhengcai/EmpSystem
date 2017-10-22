package com.empsys.dao;

import java.util.List;

import com.empsys.entity.TbEmp;

/**
 * 员工dao接口
 * @author admins
 *
 */
public interface IEmpDao {
	//添加员工的方法
	public boolean addEmp(TbEmp emp);
	//删除员工的方法
	public boolean deleteEmp(TbEmp emp);
	//修改员工信息的方法
	public boolean updateEmp(TbEmp emp);
	//查询员工信息的方法
	public List findEmpList(String hql);
	//根据id查询员工信息的方法
	public TbEmp getEmpById(int eno);
}
