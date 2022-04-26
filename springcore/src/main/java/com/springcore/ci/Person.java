package com.springcore.ci;

public class Person {
	private String name;
	private Certi certi;
	private int personId;
	//constructor
	public Person(String name, int personId,Certi certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
	}
	//to string 
	@Override
	public String toString() {
		return this.name+" : "+this.personId +" { "+this.certi.name+" }";
	}
	

}
