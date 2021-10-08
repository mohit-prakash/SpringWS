package com.mps.dto;

public class EmployeeDTO {
	private String ename,eadd;
	private float basicSalary;
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
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [ename=" + ename + ", eadd=" + eadd + ", basicSalary=" + basicSalary + "]";
	}
	
}
