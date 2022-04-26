package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Harsh Vardhan
 *
 */
@Component
public class Demo {

	/*
	 * SPEL stands for SPring Expression Language we use "#{ }" as a syntax to pass
	 * any expression in the value We use this with the @Value annotation any kind
	 * of expression can be used, like Mathematical, Logical, Methods, Constructors,
	 * Variables etc it is basically used to inject the values into the attributes
	 * of the class
	 */
	@Value("#{23+33*(1+5) }")
	private int x;
	@Value("#{5>6?66:55 }")
	private int y;

	/*
	 * To call a static method or variable following convention is to be used
	 * 
	 * @Value("#{T(class name).method name(parameters if any)}")
	 */
	@Value("#{T(java.lang.Math).sqrt(25)}") // square root of 25 will be saved in z
	private double z;
	@Value("#{T(java.lang.Math).E}") // value of final static E will be stored in e
	private double e;

	@Value("#{new java.lang.String('Harsh Vardhan Sharma')}") // a String object whose value is Harsh Vardhan Sahrma is created and stored in name
	private String name;
	
	@Value("#{ 5>4}") // just use any expression that give output as a boolean value
	private boolean isActive;

	// getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive+ "]";
	}



}
