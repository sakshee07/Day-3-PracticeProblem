package com.bridgelabz.day3;

public class DailyEmployeeWage {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation ! ");
		
		
int isFullTime = 1;
int empRatePerHour =20;
int empHrs = 8;
int empWage = 0;

double empCheck = Math.floor(Math.random()*10)%2;
		
		if (empCheck == isFullTime)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs* empRatePerHour;


		System.out.println("Employee Daily Wage is :" + empWage);
	}
}
