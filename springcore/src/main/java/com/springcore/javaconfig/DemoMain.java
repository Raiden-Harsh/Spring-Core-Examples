package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		// we have to use AnnotationConfigApplicationContext() instead of ClasspathXmlApplicatinContext
		ApplicationContext context = new AnnotationConfigApplicationContext(ThisWillBeOurConfigClass.class);
		Student obj = context.getBean("getStudent",Student.class);
		System.out.println(obj);
		obj.Study();
	}

}
