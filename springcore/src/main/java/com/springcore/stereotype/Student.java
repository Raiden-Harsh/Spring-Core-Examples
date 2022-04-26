package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*Scope of bean can be
	>Singleton : only one object is created and same is used 
	>Prototype : Every time getBean() is called a new object is created
	>Request   : used in web app 
	>Session   : used in web app 
	>GlobalSession :used in portrait application 
	*/




// we can specify the bean name by @component("beanName")
@Component
@Scope("prototype")
public class Student {
	// To have the value we can use the @Value aanotation
	@Value("Harsh Vardhan Sahrma")
	private String studentName;
	@Value("Bareilly")
	private String city;
	// this is the syntax to use collection with the @Value annotation
	// a Stand Alone collection should be present in XML config file 
	@Value("#{phones}")
	private List<String> phoneNumber;

	// getters and setters
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}
	

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setCity(String city) {
		this.city = city;
	}
	// toString method

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", phoneNumber=" + phoneNumber + "]";
	}

	

}
