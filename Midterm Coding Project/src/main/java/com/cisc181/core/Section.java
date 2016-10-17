package com.cisc181.core;

import java.util.UUID;

public class Section {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;	

	public Section() {	
		this.SectionID = UUID.randomUUID();
	}
	
	public Section(UUID CourseID, UUID SemesterID,int RoomID) {
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.RoomID = RoomID;	
		this.SectionID = UUID.randomUUID();	
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
}
	
