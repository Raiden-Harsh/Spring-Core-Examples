package com.springcore.lyfecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// we need to make this parent interface to call the register shutdown hook
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lyfecycle/config.xml");
		// we have to enable register shutdown hook
		context.registerShutdownHook();
		// calling the object
		Samosa samosaobj = (Samosa) context.getBean("s1");
		// we can use toString method to display the object fields
		System.out.println(samosaobj);
		// getting another bean
		Pepsi pobj = (Pepsi) context.getBean("p1");
		System.out.println(pobj);
		Fries fobj = (Fries) context.getBean("f1");
		System.out.println(fobj);
		System.out.println("+++++++++++++++++++++All previous objects were created +++++++++++++++++++++++++++++++"+"\n"+
				"~~~~~~~~~~~~~~~~~NOW THEY WILL BE DESTROYED IN THE ORDER OF THERE CREATION~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		

	}

}
