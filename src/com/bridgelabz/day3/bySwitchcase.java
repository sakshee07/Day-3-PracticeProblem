package com.bridgelabz.day3;

public class bySwitchcase {
	
	
	public static final int WagePerHour = 20;
	public static final int PartTime = 1;
	public static final int FullTime = 2;
    public static final int MonthWorkingDays = 20;
	public static final int TotalWorkinghour = 100;


 public static void main(String[] args)
 {
		System.out.println("Welcome to the Employee Wage Computation ! ");
		
	    int WorkingHour = 4;
		int empcheck = (int)((Math.random())*10)%3;
		switch (empcheck)
		{
			case FullTime:
			WorkingHour = 8;
			System.out.println("Employee is Present-full time");
			break;
			case PartTime:
			WorkingHour = 4;
			System.out.println("Employee is Present-part time");
			break;
			default:
			WorkingHour = 0;
			System.out.println("Employee is Absent");
			break;
		}
		int empwage = WorkingHour * WagePerHour * MonthWorkingDays;
		System.out.println("Employee Wage : "+empwage);
	 }

 }
