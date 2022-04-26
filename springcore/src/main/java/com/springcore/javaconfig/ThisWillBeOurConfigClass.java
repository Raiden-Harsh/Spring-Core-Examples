package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*now we have removed the config.xml 
 * we will be using this java class to tell the IOC container about the 
 * @Component tag and the package in which these classes are
*/
@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig") we can comment this if we are using the @Bean annotation 
public class ThisWillBeOurConfigClass {
	@Bean 
	public Samosa giveSamosa() {
		Samosa s1 = new Samosa();
		return s1;
	}
	
	@Bean //the object that gets return by this method will be used by the IOC container
	public Student getStudent() {
		Student stu = new Student(giveSamosa());
		return stu;
		
	}

}
