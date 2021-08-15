package com.syntax.class05;

import java.util.Scanner;

public class InitializeVeriableBetterWay {

	public static void main(String[] args) {

		/*
		 * ask user to enter 3 numbers then ask to find the largest
		 */

		Scanner scan;
		int num1, num2, num3, largest;

		scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			largest = num1;

		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
			
		} else {
			largest = num3;
		}

		System.out.println("The largest number " + largest);
		
		//lets identify if largest is even or odd
		
		if (largest%2==0) { //(largest%2!=0) then we have to change in syso odd and even
			System.out.println(largest+ " number is even");
		}else {
			System.out.println(largest+ " number is odd");
		}
		
		
		
	}

}
