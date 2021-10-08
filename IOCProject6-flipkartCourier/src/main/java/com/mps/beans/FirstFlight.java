package com.mps.beans;

public class FirstFlight implements Courier {
	@Override
	public void deliverProduct()
	{
		System.out.println("You Products will be delivered through FirstFlight Courier Service!!");
	}
}
