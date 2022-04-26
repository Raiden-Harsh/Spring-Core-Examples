package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoWireConfig.xml");
		
		Employee eobj = (Employee) context.getBean("emp1");
		System.out.println(eobj);
	}

}
