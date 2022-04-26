package com.springcore.lyfecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	// default constructor
	public Pepsi() {
		super();
	}

	// getters and setters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	// these are the methods form the interface
	public void afterPropertiesSet() throws Exception {
		// this will get executed just after the attributes initialization 
		System.out.println("Taking PEPSI: called from init Pepsi class");
		
	}
	public void destroy() throws Exception {
		// this will get executed just before the object is deleted 
		System.out.println("Throwing the bottle in the bin : called form the destroy method Pepsi class");
		
	}


}
