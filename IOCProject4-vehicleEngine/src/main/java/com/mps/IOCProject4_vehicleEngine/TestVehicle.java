package com.mps.IOCProject4_vehicleEngine;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mps.beans.Vehicle;

public class TestVehicle {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mps/cfgs/applicationContext.xml");
		Vehicle vh=(Vehicle)factory.getBean("veh");
		//vh.start();
		//vh.stop();
		vh.move("Araria", "Kolkata");
	}

}
