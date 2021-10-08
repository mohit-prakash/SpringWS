package com.mps.beans;

public class Flipkart {
	private Courier courier;
	private int total=0,i=0;
	private String[] items=new String[10];
	private float[] prices=new float[10];
	public void setCourier(Courier courier)
	{
		this.courier=courier;
	}
	public void addToCart(String item,float price)
	{
		items[i]=item;
		prices[i++]=price;
		total+=price;
		System.out.println(item+" added successfully to the cart.");
	}
	public void placeOrder()
	{
		System.out.println("You items List: ");
		System.out.println("Item\tPrice");
		for(int j=0;j<i;j++)
		{
				System.out.println(items[j]+"\t"+prices[j]);
		}
		courier.deliverProduct();
	}
}