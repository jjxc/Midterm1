package com.cisc181.core;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	//Add 5 staff members and calculate average salary.
	@Test (expected = PersonException.class)
	public void test() throws PersonExcpetion {
		ArrayList<Staff> StfList = new ArrayList<Staff>();
		StfList.add(new Staff("Bob", "Middle", "Smith", new Date(0), "1 Main St", "(000)-000-0000", "bms1@udel.edu",
				"1-2", 1, 40000, new Date(100),eTitle.MR));
		StfList.add(new Staff("Zach", "Middle", "Smith", new Date(0), "2 Main St", "(000)-000-0000", "zms1@udel.edu",
				"1-2", 1, 50000, new Date(100),eTitle.MR));
		StfList.add(new Staff("Dylan", "Middle", "Smith", new Date(0), "3 Main St", "(000)-000-0000", "dms1@udel.edu",
				"1-2", 1, 60000, new Date(100),eTitle.MR));
		StfList.add(new Staff("Jane", "Middle", "Smith", new Date(0), "4 Main St", "(000)-000-0000", "jms1@udel.edu",
				"1-2", 1, 70000, new Date(100),eTitle.MS));
		StfList.add(new Staff("Mary", "Middle", "Smith", new Date(0), "5 Main St", "(000)-000-0000", "mms1@udel.edu",
				"1-2", 1, 80000, new Date(100),eTitle.MS));
		
		double avgSalary = (StfList.get(0).getSalary() + StfList.get(1).getSalary() + StfList.get(2).getSalary()
				 + StfList.get(3).getSalary() + StfList.get(4).getSalary()) / 5;
			
		assertTrue(avgSalary == 60000);
	}	

	//Test for a wrong Date of Birth.
	@Test (expected = PersonException.class)
	public void testInvalidDOB() throws PersonException {
		Calendar t = Calendar.getInstance();
		t.set(Calendar.YEAR, 1500);
		Date invalidDOB = t.getTime();
		Staff invStaff = new Staff("Ashe", "Middle", "Smith", invalidDOB, "10 Main St.", "(000)-000-0000", "ams1@udel.edu",
				"1-2", 1, 1000, new Date(100),eTitle.MS);
	}
	
	//Test for an improperly formatted phone number.
	@Test (expected = PersonException.class)
	public void testInvalidPhone() throws PersonException {
		Staff invStaff1 = new Staff("Sam", "Middle", "Smith", new Date(0), "10 Main St.", "000-000-000", "sms1@udel.edu",
				"1-2", 1, 1000, new Date(100),eTitle.MR);
	}
}
