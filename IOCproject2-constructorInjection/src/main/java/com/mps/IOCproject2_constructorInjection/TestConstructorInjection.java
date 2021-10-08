package com.mps.IOCproject2_constructorInjection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mps.beans.WishMessageGenerator;

public class TestConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemResource res = new FileSystemResource("src/main/java/com/mps/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		WishMessageGenerator generator = (WishMessageGenerator)factory.getBean("wmg");
		System.out.println(generator.getWish("Mohit"));
	}

}
