package com.mps.controller;

import com.mps.dto.EmployeeDTO;
import com.mps.service.IEmployeeMgmtService;
import com.mps.vo.EmployeeVO;

public class MainController {
	private IEmployeeMgmtService service;

	public MainController(IEmployeeMgmtService service) {
		super();
		this.service = service;
	}
	public String processEmp(EmployeeVO vo) throws Exception
	{
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setEadd(vo.getEadd());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		service.setEmployeeBO(dto);
		return "Gross Salary: "+service.generateGrossSalary(dto)+" and Net Salary: "+service.generateNetSalary(dto); 
	}
}
