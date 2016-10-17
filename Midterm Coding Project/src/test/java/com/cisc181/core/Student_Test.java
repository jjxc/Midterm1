package com.cisc181.core;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	//Create ArrayLists
	static ArrayList<Course> crsList;
	static ArrayList<Semester> semList;
	static ArrayList<Section> secList;
	static ArrayList<Student> stuList;
	
	
	//Set up the lists before testing.
	@BeforeClass
	public static void setup() throws Exception {
		crsList = new ArrayList<Course>();
		crsList.add(new Course (UUID.randomUUID(), "CHEM103", 4, eMajor.CHEM));
		crsList.add(new Course (UUID.randomUUID(), "MATH221", 4, eMajor.BUSINESS));
		crsList.add(new Course (UUID.randomUUID(), "CISC181", 4, eMajor.COMPSI));
		
		semList = new ArrayList<Semester>();
		semList.add(new Semester (UUID.randomUUID(), new Date(100), new Date(200)));
		semList.add(new Semester (UUID.randomUUID(), new Date(300), new Date(400)));
		
		secList = new ArrayList<Section>();
		secList.add(new Section (crsList.get(0).getCourseID(), UUID.randomUUID(), 012));
		secList.add(new Section (crsList.get(1).getCourseID(), UUID.randomUUID(), 345));
		secList.add(new Section (crsList.get(2).getCourseID(), UUID.randomUUID(), 678));
		
		stuList = new ArrayList<Student>();
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.BUSINESS, "1 Hall St", "(000)-000-0001", "stu1@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.BUSINESS, "2 Hall St", "(000)-000-0002", "stu2@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.COMPSI, "3 Hall St", "(000)-000-0003", "stu3@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.COMPSI, "4 Hall St", "(000)-000-0004", "stu4@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.CHEM, "5 Hall St", "(000)-000-0005", "stu5@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.CHEM, "6 Hall St", "(000)-000-0006", "stu6@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.PHYSICS, "7 Hall St", "(000)-000-0007", "stu7@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.PHYSICS, "8 Hall St", "(000)-000-0008", "stu8@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.NURSING, "9 Hall St", "(000)-000-0009", "stu9@udel.edu"));
		stuList.add(new Student ("firstName", "middleName", "lastName", new Date(0), eMajor.NURSING, "10 Hall St", "(000)-000-0010", "stu10@udel.edu"));
	}

	//Enroll the students and set their grades.
	@Test
	public void testEnroll() {
		ArrayList<Enrollment> enrollList = new ArrayList<Enrollment>();
		ArrayList<Double> stuGPAList = new ArrayList<Double>();
		ArrayList<Double> secGPAList = new ArrayList<Double>();
		
		for (Student s : stuList) {
			enrollList.add(new Enrollment(stuList.getStudentID(), secList.getSectionID()).setGrade(3.0);
			
		}
	}
	//TODO Calculate GPAs and sectionGPAs
	
	//Change a student's major
	@Test
	public void testMajorChg() {
		stuList.get(0).setMajor(eMajor.COMPSI);
		assertEquals(stuList.get(0).getMajor(), eMajor.COMPSI);
	}
}