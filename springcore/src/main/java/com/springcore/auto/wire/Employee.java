package com.springcore.auto.wire;

public class Employee {
	private Address address;

	// default constructor
	public Employee() {
		super();
	}
	// getters and setters

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// toString
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
