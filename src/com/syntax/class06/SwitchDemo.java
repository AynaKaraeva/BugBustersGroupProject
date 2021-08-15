package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		/*
		 * Declare a variable day and then based on the day value provide output such as
		 * if day is equal to 1--> Today is Monday if day is equal to 2 --> Today is
		 * Tuesday
		 */

		int day = 7;
		
		
        // If statement is condition (true/false) based statement 
		// If is like ladder or stairs 
		
		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tusday");
		} else if (day == 3) {
			System.out.println("Yoday is Wendsday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println(day + " day is invalid day number. Please use day from 1-7");
		}

		System.out.println("------------USING SWITCH STATMENT-----------");

	String dayName;
		
		// Switch is value based statement. If find matching value case and jumps right away
		// Switch is like an elevator
		
		
		/*
		 * in Switch case always remember:
		 * 
		 * Always use break; --> to stop and get out from switch block 
		 * variable type and case values MUST be of same dataType
		 * 
		 * default: --> is optional
		 * 
		 */
		
		switch (day) {

		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursaday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "sunday";
			break;
		default:
			dayName = "Invalid";
			break;

		}

		System.out.println("Today is " + dayName);

	}

}
