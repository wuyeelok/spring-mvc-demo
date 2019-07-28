package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotBlank;

public class Customer {

	private String firstName;

	@NotBlank(message = "can not be blank")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
