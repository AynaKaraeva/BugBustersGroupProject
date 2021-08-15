package com.syntax.class03;

public class HomeWork {

	public static void main(String[] args) {

		/*
		 * Create a Java program and declare int variable that will hold a month. Based
		 * on the value of the variable your program should print the name of the month.
		 */

		int month = 8;

		if (month == 1) {
			System.out.println("The month is January");
		} else if (month == 2) {
			System.out.println("The mont is February");
		} else if (month == 3) {
			System.out.println("The month is March");
		} else if (month == 4) {
			System.out.println("The month is April");
		} else if (month == 5) {
			System.out.println("The mont is May");
		} else if (month == 6) {
			System.out.println("The month is June");
		} else if (month == 7) {
			System.out.println("The month is July");
		} else if (month == 8) {
			System.out.println("The month is August");
		} else if (month == 9) {
			System.out.println("The month is September");
		} else if (month == 10) {
			System.out.println("The month is October");
		} else if (month == 11) {
			System.out.println("The month is November");
		} else if (month == 12) {
			System.out.println("The month is December");
		} else {
			System.out.println("Inavlid number of the month");
		}

		System.out.println("----------------------------------");

		/*
		 * Write a program to check whether number is positive or negative. *
		 */

		int cTemp = - 30; // NOT RIGHT BECAUSE OF >25 

		if (cTemp > 25) {
			System.out.println("If temperature is " + cTemp + " then I go to the beach");
		} else  {
			System.out.println("If temperature is " + cTemp + "then I stay home");
		}

		System.out.println("---------------RIGHT EXAMPLE--------");
		
		int number = 0; // WHEN WE COMPARE TO 0 TO KNOW IS A NUMBERS POSITIVE OR NEGATIVE OR 0

		if (number > 0) {
			System.out.println("If temperature is " + number + " then I go to the beach");
		} else if (number < 0) {
			System.out.println("If temperature is " + number + "then I stay home");
		} else {
			System.out.println("Your number is " + number);
		}

		
		
		
		System.out.println("-------------------------------------");

		/*
		 * Write a Java Program to check whether number is Even or Odd.
		 */

		int fun = 60;

		if (fun % 2 == 0) { 
			
		/*
		 * don't understand why ==0  “If variable fun divided by 2 has a remainder of the zero”, then…
		 * In other words, it checks if I is an even number, because any number that is divided by 
		 * two that has a remainder of zero would be even
		 */

			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

		/*
		 * Reminder example
		 */
		
		int i=10/3;
		System.out.println(i); //3
		
		int mod=10%3;
		System.out.println(mod); //1
	}
	

}
