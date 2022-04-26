package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;

//@Component we are commenting this as we are using the @Bean
public class Student {
	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa=samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void Study() {
		samosa.dispay();
		System.out.println("Are you Studying!!!");
	}

}
