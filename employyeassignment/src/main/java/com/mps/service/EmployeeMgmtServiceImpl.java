package com.mps.service;

import com.mps.bo.EmployeeBO;
import com.mps.dao.IEmployeeDAO;
import com.mps.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	private IEmployeeDAO dao;

	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		super();
		this.dao = dao;
	}
	public void setEmployeeBO(EmployeeDTO dto) throws Exception
	{
		EmployeeBO bo=new EmployeeBO();
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setEadd(dto.getEadd());
		bo.setEname(dto.getEname());
		bo.setGrossSalary(1.4f*dto.getBasicSalary());
		bo.setNetSalary(0.9f*(1.4f*dto.getBasicSalary()));
		int count=dao.insert(bo);
		if (count!=0)
			System.out.println("Record Successfully Inserted!!");
		else
			System.out.println("Record Not inserted");
	}
	@Override
	public float generateGrossSalary(EmployeeDTO dto) throws Exception
	{
		return 1.4f*dto.getBasicSalary();
	}
	@Override
	public float generateNetSalary(EmployeeDTO dto) throws Exception
	{
		return 0.9f*generateGrossSalary(dto);
	}
}
