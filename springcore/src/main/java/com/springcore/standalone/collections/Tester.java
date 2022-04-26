package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/aloneconfig.xml");
		// if we pass the class in the parameter of getBean we don't have to type cast
		// it
		Person pobj = context.getBean("person1", Person.class);
		System.out.println(pobj);
		System.out.println(pobj.getFriends().getClass().getName());
		System.out.println("_____________________________________________________________________________________");
		System.out.println(pobj.getFeeStructure());
		System.out.println(pobj.getFeeStructure().getClass().getName());
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println(pobj.getProperties());

	}

}
