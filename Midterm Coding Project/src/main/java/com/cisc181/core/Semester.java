package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	
	//create attributes
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	//no arg
	public Semester() {
	}
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) {
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}

	//getters
	public UUID getSemesterID() {
		return SemesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public Date getEndDate() {
		return EndDate;
	}
	
	
}
