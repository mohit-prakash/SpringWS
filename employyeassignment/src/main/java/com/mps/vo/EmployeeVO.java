package com.mps.vo;

public class EmployeeVO {
	private String ename,eadd,basicSalary;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	public String getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "EmployeeVO [ename=" + ename + ", eadd=" + eadd + ", basicSalary=" + basicSalary + "]";
	} 
	
}
