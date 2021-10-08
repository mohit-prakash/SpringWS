package com.mps.service;

import com.mps.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
	public void setEmployeeBO(EmployeeDTO dto) throws Exception;
	public float generateNetSalary(EmployeeDTO dto) throws Exception;
	public float generateGrossSalary(EmployeeDTO dto) throws Exception;
}
