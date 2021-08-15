package com.syntax.class09;

public class HomeWorkTask3 {

	public static void main(String[] args) {

		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */

		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int sum = 0;

		for (int a = 0; a < number.length; a++) {

			sum = sum + number[a];
		}
		System.out.println("Sum of array elements is:" + sum);

		
		
		System.out.println("-----------SUM USING ENHANCED FOR LOOP");

		
		sum=0;
		
		for (int num : number) {
			sum += num;
		}
		
		System.out.println("Total= " + sum);
		
		
		
		
		
		
		
	}

}
