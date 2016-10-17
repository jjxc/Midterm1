package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	//Create atributes
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	//no arg
	private Enrollment(){
	}
	
	
	public Enrollment(UUID SectionID, UUID StudentID){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		
	}
	
	//getters and setters
	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	

}
