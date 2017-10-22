package com.empsys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.empsys.entity.TbEmp;
import com.empsys.service.IEmpService;
import com.empsys.dao.IEmpDao;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED)
public class EmpServiceImpl implements IEmpService {

	//声明要引用的dao
	@Resource(name="empDao")
	private IEmpDao empDao;
	
	@Override
	public boolean addEmp(TbEmp emp) {
		return empDao.addEmp(emp);
	}

	@Override
	public boolean deleteEmp(TbEmp emp) {
		return empDao.deleteEmp(emp);
	}

	@Override
	public boolean updateEmp(TbEmp emp) {
		return empDao.updateEmp(emp);
	}

	@Override
	public List findEmpList() {
		String hql = "from TbEmp e inner join e.dept d order by d.dno";
		return empDao.findEmpList(hql);
	}

	@Override
	public TbEmp getEmpById(int eno) {
		return empDao.getEmpById(eno);
	}

	public void setEmpDao(IEmpDao empDao) {
		this.empDao = empDao;
	}
	
}
