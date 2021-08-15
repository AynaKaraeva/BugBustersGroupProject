package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

		/*
		 * Write a program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println(" Please enter 3 numbers");

		int num1, num2, num3, largest;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1==num2 && num2==num3) {
			
		}
		
		
		if (num1 >= num2) { // assuming num1 is larger than num2
			if (num1 > num3) { // assuming num1 is larger than num3
				largest = num1; // System.out.println("The largest number is "+ num1);
			} else { // looking that num3 is larger than num1
				largest = num3; // System.out.println("The largest number is " + num3);
			}
		} else {
			if (num2 > num3) { // num2 is larger than num1
				largest = num2; // System.out.println("The largest number is " + num2);
			} else { // looking num3 is larger than num2
				largest = num3; // System.out.println("The largest number is " + num3);
			}
		}

		System.out.println("The largest number is " + largest);

	}

}
