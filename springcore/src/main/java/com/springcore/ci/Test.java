package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person obj =(Person)context.getBean("person");
		System.out.println(obj.toString());
		
		Addition addobj=(Addition)context.getBean("add");
		addobj.doSum();
	}

}
