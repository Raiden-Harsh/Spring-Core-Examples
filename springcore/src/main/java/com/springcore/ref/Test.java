package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A aobj = (A)context.getBean("aref");
		B bobj=(B)context.getBean("bref");
		System.out.println(aobj.toString());
		//we can put individual values of x and y
		System.out.println("X: "+aobj.getX()+" Y: "+aobj.getOb().getY());
	}

}
