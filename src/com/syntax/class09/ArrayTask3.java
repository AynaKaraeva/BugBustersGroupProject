package com.syntax.class09;

public class ArrayTask3 {
	
	public static void main (String[] args) {
		
		
		/*
		 * Create an array of cars and store 6 elements into it
		 * Print all values from the array
		 */
		
		String[] cars= { "Tesla", "Toyota", "BMW", "Honda", "Jaguar", "Jeep"};
		
		for (int a=0; a<cars.length; a++) {
			System.out.println(cars[a]);
		}
		
		
		System.out.println("-----------advance for loop/enhaced for loop/ for each loop---------");
		
		
		//advance for loop - CAN BE USED ONLY WITH ARRAYS OR COLLECTIONS
		
		for(String boo:cars) {
			System.out.println(boo);
		}
		
		System.out.println("-----------NUMBERS ARRAY----------");
		
		int[] numbers= {100,20,67,90,23};
		
		for(int i=0; i<numbers.lenght; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
		
	}

}
