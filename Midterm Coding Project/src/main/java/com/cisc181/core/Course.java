package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
		
		//create attributes
		private UUID CourseID;
		private String CourseName;
		private int GradePoints;
		private eMajor Major;
		
		//no arg
		public Course() {
		}

		public Course(UUID CourseID, String CourseName, int GradePoints,eMajor Major){
			this.CourseID = CourseID;
			this.CourseName = CourseName;
			this.GradePoints = GradePoints;
			this.Major = Major;
		}
		
		//getters
		public UUID getCourseID() {
			return CourseID;
		}
		
		public String getCourseName() {
			return CourseName;
		}
		
		public int getGradePoints() {
			return GradePoints;
		}
				
				
				
	}
