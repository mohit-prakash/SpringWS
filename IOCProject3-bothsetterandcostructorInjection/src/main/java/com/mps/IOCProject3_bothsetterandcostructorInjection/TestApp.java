package com.mps.IOCProject3_bothsetterandcostructorInjection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mps.beans.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource res = new FileSystemResource("src/main/java/com/mps/cfgs/contextapplication.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Object obj = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		System.out.println(generator.getWish("Mohit"));
	}

}
