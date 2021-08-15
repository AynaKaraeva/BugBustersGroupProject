package com.syntax.class04;

import java.util.Scanner;

public class AnotherScannerExample {
	
	public static void main(String[] args) {
		

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter city");
		String city = input.nextLine(); //capturing String value and we need to hit enter
		
		System.out.println("Please enter temperature");
		double temp = input.nextDouble(); //capturing double value and we need to hit enter
	
		
		System.out.println("It is "+ temp + " in " + city);
		
	}

}
