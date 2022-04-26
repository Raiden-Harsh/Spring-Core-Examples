package com.springcore.lyfecycle;

public class Samosa {
	private double price;
	// default constructor

	public Samosa() {
		super();

	}
	// getters and setters

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}
	// toString method

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	//making the init methods but they will not get called unless they are specified inside the XML file
	
	public void init() {
		System.out.println("Inside INIT method:Samosa ");
	}
	public void destroy() {
		System.out.println("Inside DESTROY method:Samosa");
	}
}
