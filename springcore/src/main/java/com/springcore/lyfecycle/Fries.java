package com.springcore.lyfecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Fries {
	private String brand;

	// default constructor
	public Fries() {
		super();
	}

	//getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	// toString

	@Override
	public String toString() {
		return "Fries [brand=" + brand + "]";
	}
	// Creating methods for init and destroy
	// By default all the annotations are disabled 
	// To enable them go to the xml file and change context tag
	@PostConstruct //this annotation will require a new dependency in POM file for java 9+ and it is working like init					
	public void anyNameForInit() {
		System.out.println("CALLING INIT METHOD FORM :Fries");
	}
	@PreDestroy // this annotation will work like a destroy method 
	public void anyNameForDestroyMethodBawa() {
		System.out.println("CALLING DESTROY METHOD FROM: Fries");
	}
	
	

}
