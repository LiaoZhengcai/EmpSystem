package com.empsys.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.empsys.entity.TbDept;

@Entity
@Table(name="tb_emp")
public class TbEmp implements Serializable{
	private int eno;
	private String ename;
	private int eage;
	private String esex;
	
	private TbDept dept;

	
	public TbEmp() {
		super();
	}

	public TbEmp(int eno, String ename, int eage, String esex) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.eage = eage;
		this.esex = esex;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEsex() {
		return esex;
	}

	public void setEsex(String esex) {
		this.esex = esex;
	}

	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="edno")
	public TbDept getDept() {
		return dept;
	}

	public void setDept(TbDept dept) {
		this.dept = dept;
	}
	
}
