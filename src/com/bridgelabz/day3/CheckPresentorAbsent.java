package com.bridgelabz.day3;

public class CheckPresentorAbsent {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Employee Wage Computation ! ");
		int is_full_time = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if (empCheck == is_full_time) {
		
		  System.out.println("Employee is persent.");
		
		 } else {
			System.out.println("Employee is absent");
			
		}
		}

}
