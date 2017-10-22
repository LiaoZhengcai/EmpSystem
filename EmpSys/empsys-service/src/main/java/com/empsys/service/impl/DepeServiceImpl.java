package com.empsys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.empsys.entity.TbDept;
import com.empsys.service.IDeptService;
import com.empsys.dao.IDeptDao;

@Service("deptService")
@Transactional(propagation=Propagation.REQUIRED)
public class DepeServiceImpl implements IDeptService {

	//声明要引用的dao
	@Resource(name="deptDao")
	private IDeptDao deptDao;
	
	@Override
	public boolean addDept(TbDept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public boolean deleteDept(TbDept dept) {
		return deptDao.deleteDept(dept);
	}

	@Override
	public boolean updateDept(TbDept dept) {
		return false;
	}

	@Override
	public List findDeptList() {
		String hql = "from TbDept";
		return deptDao.findDeptList(hql);
	}

	@Override
	public TbDept getDeptById(int dno) {
		return deptDao.getDeptById(dno);
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}

}
