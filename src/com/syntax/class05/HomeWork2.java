package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		/*
		 * Write a program for user to enter his/hers birth month.
		 * Based on the month define the season.
		 * Example: if user is born in June, July or August → season =“Summer”.
		 * At the end of the program we should see output as “You were born is season ______“.
		 */
		
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Please enter your birth month");
		
		String month=scan.nextLine();
		String season="";
		
		if (month.equals("December") || month.equals("January") || month.equals("February")){
			season="Winter";
			
		}else if (month.equals("March") || month.equals("April") || month.equals("May")){
			season="Spring";
			
		}else if (month.equals("June") || month.equals("July") || month.equals("August")){
			season="Summer";
			
		}else if (month.equals("September") || month.equals("October") || month.equals("November")){
			season="Autumn";
			
		}else {
			System.out.println("Please enter a right month");
	}
		 if (!season.isEmpty()) {
			 System.out.println("You were born in " + season); 
		 }
		
		
		
		
		
		
		
		
		
	}

}
