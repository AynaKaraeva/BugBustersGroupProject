package com.syntax.class05;

import java.util.Scanner;

public class StringComparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * write a program to ask if user got a visa
		 * If user got a visa let's ask how long (years) is visa for
		 * if visa is more than 1 year --> cool
		 * if less --> you will have to go back in 1 year and to apply again
		 */
		
		
		Scanner scan;
		String visa; // boolean visa;
		int years;
		
		scan=new Scanner(System.in);
		System.out.println("Hey did you get your visa?");
		
		visa=scan.next(); // visa=scan.nextBoolean(); the answer should be "true" or "false"
		
		if(visa.equals("yes")) { //if(visa){
			System.out.println("Congratulation, how long is ypue visa for?");
			
			years=scan.nextInt();
			
			if(years>1) {
				System.out.println("That is awesome");
			}else {
				System.out.println("You will have to go back in 1 year and to apply again");
			}
			
		}
		
		
		
	}

}
