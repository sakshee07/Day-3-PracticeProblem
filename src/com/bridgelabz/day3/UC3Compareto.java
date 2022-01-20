package com.bridgelabz.day3;

import java.util.Scanner;

    public class UC3Compareto {
    	
	
	public static void main(String[] args) {

	
		System.out.println("Welcome to Line Comaprison Problem ! ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter thr value of Co Ordinate");
		System.out.println("Enter the value of (x1,y1)= ");
		         int x1 = sc.nextInt();
		         int y1 = sc.nextInt();
		System.out.println("Enter the value of (x2,y2)= ");
				int x2 = sc.nextInt();
				int y2 = sc.nextInt();
				
				
		Double Line1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Distance for line1 "+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+  Line1);

		System.out.println("Enter the values of (x3,y3)= ");
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
		System.out.println("Enter the value of (x4,y4)= ");
			int x4= sc.nextInt();
			int y4 = sc.nextInt();
			
		Double Line2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
	    System.out.println("Distance for line2 "+"( "+x3+","+y3+"),"+"("+x4+","+y4+")" + Line2);
				
	    
	   
	    System.out.println(Line1.compareTo(Line2));
        }
	}
    
    



	


