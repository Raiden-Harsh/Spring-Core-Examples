package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		//to get the object use camel casing while writing the class name
		Student sobj= context.getBean("student",Student.class);
		System.out.println(sobj);
		System.out.println(sobj.hashCode());
		// making a new object
		Student obj2 = context.getBean("student",Student.class);
		System.out.println(obj2.hashCode());
		System.out.println("---------------------------------------------------------------------------------------------");
		Teacher t1 = context.getBean("teacher",Teacher.class);
		Teacher t2 = context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
