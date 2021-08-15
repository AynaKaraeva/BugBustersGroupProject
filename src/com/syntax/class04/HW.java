package com.syntax.class04;

public class HW {

	public static void main(String[] args) {

		/*
		 * reminder example
		 */

		int i = 10 / 3;

		
		/*
		 * You are a loan specialist and you need to ask user what is the 
		 * amount of loan is needed. If loan is less or equal to 200,000
		 *  then you would lend the money otherwise you would reject the client. 
		 */
		
		int loan=200000;
		
		if (loan<=250000) {
			System.out.println("You are approved for loan");
		}else {
			System.out.println("You are not approved");
		}
		
		
		System.out.println("----------------------------------");
		
		
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		
		int age=15;
		
		if (age<=18) {
			System.out.println("Ypu can have driver license");
		}else {
			System.out.println("You can have a learner permit");
		}
		
		
		System.out.println("--------------------------------------------");
		
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print
		 *  “The temperature is the city __ is __”
		 */
		
		String city= "New York";
		double temp=89.6;
		temp=89.6-32;
		
		System.out.println(" The temperature in the city "+ city + " is " + temp );
		
		
		
	}

}
