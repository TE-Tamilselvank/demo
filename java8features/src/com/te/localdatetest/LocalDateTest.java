package com.te.localdatetest;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTest {
	
	public static void main(String[] args) {
		//LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.parse("1999-09-07");
		
		System.out.println(date2);
		System.out.println(date2.getDayOfMonth());
		System.out.println(date2.getDayOfYear());
		System.out.println(date2.getYear());
		System.out.println(date2.isLeapYear());
		System.out.println(date2.withDayOfMonth(7));
		
	
		
		
	
	
	
	
	
	
	
	}

}
