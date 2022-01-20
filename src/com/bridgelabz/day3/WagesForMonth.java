package com.bridgelabz.day3;

public class WagesForMonth {

	public static void main(String[] args) {
	System.out.println("Welcome to the Employee Wage Computation ! ");
		

		int WagePerHour = 20;
		int WorkingHour = 8;
		int WorkingDays = 20;
	
		int MonthlyWage = WorkingHour*WorkingDays*WagePerHour;
		
		System.out.println("Employee Monthly wage is : " + MonthlyWage);
	}
}
 	
	
	