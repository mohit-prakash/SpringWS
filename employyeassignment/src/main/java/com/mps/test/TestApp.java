package com.mps.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mps.controller.MainController;
import com.mps.vo.EmployeeVO;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mps/cfgs/applicationContext.xml");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name: ");
		String ename=sc.nextLine();
		System.out.print("Enter Employee Address: ");
		String eadd=sc.nextLine();
		System.out.print("Enter Basic Salary: ");
		String basicSalary=sc.next();
		EmployeeVO vo = new EmployeeVO();
		vo.setBasicSalary(basicSalary);
		vo.setEadd(eadd);
		vo.setEname(ename);
		MainController controller=factory.getBean("controller",MainController.class);
		try {
					String str=controller.processEmp(vo);
					System.out.println(str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
