package com.syntax.class08;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 */

		
		for (int i=1; i<=50; i++) {
			
			if (i % 3== 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
		
		System.out.println("-----------------TASK 2 ------------------");
		
		/*
		 * Create a program that will keep asking user to apply for a credit card.
		 *  As soon you get “yes” from a user program should stop asking.
		 */
		
		
		Scanner scan=new Scanner(System.in);
		String credit;
		
		do {
			System.out.println("Would you like to apply for credit card?");
			credit=scan.next();
			if (credit.equalsIgnoreCase("yes")) { // equalsIgnoreCase = doesn't matter lower case or upper case letters
				break;
			}
		} while (true);
		
		System.out.println("Congratulation on selecting credit card!");

		
		System.out.println("-------------------------------------------------");
		
		for (int i = 1; i>5; i++) {
			
			System.out.println(i+ " ");
		}
		
		System.out.println("End of the code --------");
		
		
		
		
		
	}

}
