package com.mps.service;

import com.mps.bo.StudentBO;
import com.mps.dao.IStudentDAO;
import com.mps.dto.StudentDTO;

public class StudentMgmtServiceImpl implements IStudentMgmtService {
	private IStudentDAO dao;
	public StudentMgmtServiceImpl(IStudentDAO dao)
	{
		this.dao=dao;
	}
	@Override
	public String generateResult(StudentDTO dto) throws Exception
	{
		int total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg=total/3.0f;
		String result=null;
		if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=75)
			result="First class with Distinction";
		else if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=60)
			result="First class";
		else if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=50)
			result="Second  class";
		else if(dto.getM1()>35 && dto.getM2()>35 && dto.getM3()>35 && avg>=35)
			result="Third  class";
		else
			result="Fail";
		StudentBO bo=new StudentBO();
		bo.setSname(dto.getSname());//inputs
		bo.setSadd(dto.getSadd()); //inputs
		bo.setTotal(total); bo.setAvg(avg);bo.setResult(result);
		   int count=dao.insert(bo);
		   //return result
		return count==0?"Student Registration failed :: Result is::"+result :"Student registration succedded:: result is ::"+result;
	}
	
}
