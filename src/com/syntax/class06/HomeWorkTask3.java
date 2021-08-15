package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask3 {

	public static void main(String[] args) {

		/*
		 * Using scanner class create calculator.Allow user to enter 2 numbers and
		 * operator(+/-,*). Based on operator provide the result to user. Please
		 * complete this assignment in 2 way: using if statement and switch case.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two different numbers");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result=0; //if use default then int result;

		System.out.println("Please enter your operator");
		String operator = scan.next(); // it could be char

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		//default:
			//result = 0;

		}
		
		if (result!=0) {
			System.out.println(num1 + " "+ operator + " " + num2 + " = "+ result);
		}
		
		
		
		
		
		
		
		
	
		
	}

}
