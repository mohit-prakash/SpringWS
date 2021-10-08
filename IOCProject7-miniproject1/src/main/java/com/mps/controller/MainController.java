package com.mps.controller;

import com.mps.dto.StudentDTO;
import com.mps.service.IStudentMgmtService;
import com.mps.vo.StudentVO;

public class MainController {
	private IStudentMgmtService service;

	public MainController(IStudentMgmtService service) {
		this.service = service;
	}
	public String processStudent(StudentVO vo)throws Exception{
		//convert StudentVO class obj to StudentDTO class obj
		StudentDTO dto=new  StudentDTO();
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use service
		String result=service.generateResult(dto);
		return result;
	}
	
}
