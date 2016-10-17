package com.cisc181.exceptions;

import java.util.Date;

public class PersonException extends Exception {

	public Date DOB;
	
	public Date getDOB() {
		return DOB;
	}
	
	public PersonException(Date invalidDOB) {
		this.DOB = invalidDOB;
		System.out.println("Invalid Date of Birth.");
	}
	
	public String PhoneNumber;
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public PersonException(String invalidPhone) {
		this.PhoneNumber = invalidPhone;
		System.out.println("Invalid Phone Number.");
	}
}
