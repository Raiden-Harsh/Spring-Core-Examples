package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	// making two overloaded constructors
	
	public Addition(int a , int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor called INT INT ");
	}
	public Addition(double a , double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor called Double Double ");
		
	}
	public Addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor called String , String");
		
	}
	public void doSum() {
		System.out.println("Value of:" +"\n"+ "a = "+this.a+ "\n" +"b = "+this.b);
	
		System.out.println("Sum is = "+(this.a+this.b));
	}

}
