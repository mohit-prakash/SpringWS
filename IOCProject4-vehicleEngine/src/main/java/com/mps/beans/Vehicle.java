//Vehicle.java
package com.mps.beans;

public class Vehicle {
	private Engine engine;
	public void setEngine(Engine engine)
	{
		this.engine=engine;
	}
	public void start()
	{
		engine.start();
	}
	public void stop()
	{
		engine.stop();
	}
	public void move(String startPlace,String destPlace) throws Exception
	{
		engine.start();
		System.out.println("Vehicle is moving....");
		System.out.print("Vechicle started at "+startPlace+" ");
		int i=20;
		while(i>0) {
			System.out.print("_ ");
			Thread.sleep(1000);
			i--;
		}
		System.out.println(" Vehicle reached at "+destPlace);
		engine.stop();
	}
}
