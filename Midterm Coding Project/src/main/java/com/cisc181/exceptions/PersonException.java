package com.cisc181.exceptions;

import java.util.Date;

public class PersonException extends Exception {

	/**
	 * 
	 */
	//SerialVersionUID??? Not sure, could you explain when grading this? Or I can ask you at office hours
	private static final long serialVersionUID = 1L;
	
	public Date DOB;
	
	public Date getDOB() {
		return DOB;
	}
	
	//exception message for inputting invalid DOB
	public PersonException(Date invalidDOB) {
		this.DOB = invalidDOB;
		System.out.println("Invalid Date of Birth.");
	}
	
	public String PhoneNumber;
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	//exception message for inputting invalid phone number
	public PersonException(String invalidPhone) {
		this.PhoneNumber = invalidPhone;
		System.out.println("Invalid Phone Number.");
	}
}
