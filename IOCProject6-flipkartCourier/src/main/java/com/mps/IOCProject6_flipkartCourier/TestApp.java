package com.mps.IOCProject6_flipkartCourier;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mps.beans.Flipkart;

public class TestApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mps/cfgs/applicationContext.xml");
		Flipkart fp=(Flipkart)factory.getBean("fk");
		fp.addToCart("Mobile", 15000.00f);
		fp.addToCart("Books", 1200.00f);
		fp.addToCart("Pens", 305.00f);
		fp.addToCart("Ipad", 25000.00f);
		fp.addToCart("Alexa", 5000.00f);
		fp.placeOrder();
	}

}
