package com.syntax.class04;

import java.util.Scanner;

public class CompareNumbers {
	
	public static void main(String[] args) {
		
		//compare 2 numbers and see which one is the largest
		
		Scanner hp=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int num1=hp.nextInt();
		
		System.out.println("Please enter a second number");
		int num2=hp.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+ " is larger than " +num2);
		} else if (num1<num2) {
			System.out.println(num1+ " is smaller than " +num2);
		} else {
			System.out.println(num1+ " is equal than " +num2);
		}
		
	}

}
