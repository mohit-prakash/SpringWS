package com.mps.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mps.beans.WishMessageGenerator;

public class SetterInjection {

	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/mps/cfgs/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Object obj = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		String result = generator.getWish("Mohit");
		System.out.println("Result: "+result);
	}

}
