package com.mps.bo;

public class EmployeeBO {
	private float basicSalary, grossSalary, netSalary;
	private String ename,eadd;
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(float grossSalary) {
		this.grossSalary = grossSalary;
	}
	public float getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}
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
	@Override
	public String toString() {
		return "EmployeeBO [basicSalary=" + basicSalary + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary
				+ ", ename=" + ename + ", eadd=" + eadd + "]";
	}
	
}
