package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTaskCalculator {

	public static void main(String[] args) {
		
		
		
		/*
		 * Home Work Task 3
		 */

		Scanner scan =new Scanner(System.in);
		
		double x, y, result =0;
		char operator;
		String operation=null; //ALL NON PREMETIVE ALWAYS ARE NULL
		
		System.out.println("Enter first number");
		x=scan.nextDouble();
		
		System.out.println("Enter ariphmentic operator + or - or * or / ");
		operator=scan.next().charAt(0);
		
		System.out.println("Enter second number");
		y=scan.nextDouble();
		
		
			if (operator=='+') {
				result= x+y;
				operation= "addition";
			}else if (operator== '-') {
				result= x-y;
				operation="substruction";
			}else if (operator=='*') {
				result=x*y;
				operation= "multiplication";
			}else if (operator== '/') {
				result=x/y;
				operation="division";
			} else {
			System.out.println("Wrong ariphmen");
		}
		
			System.out.println("The result of" + operation+ " "+ x + " and "+ y +" is "+ result);
		
		
	
		
		
		
		
		
	}

}
