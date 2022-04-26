package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired // @Autowired annotation on attributes
	@Qualifier("address2") // this @Qualifier annotation is used if more then is one bean of same type is
							// used with the @Autowired annotation or else it will throw an exception	
							// in the qualifier give the bean name as parameter
	private Address address;

	// default constructor
	public Employee() {
		super();
	}

	// @Autowired can be used on the parameterized constructor to call the
	// constructor
	public Employee(Address address) {
		this.address = address;
	}
	// getters and setters

	public Address getAddress() {
		return address;
	}

	// @Autowired can be used hare as well to call the setter methods
	public void setAddress(Address address) {
		this.address = address;
	}

	// toString
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
