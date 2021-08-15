package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {
	public static void main(String[] args) {
		
		/*
		 * write a program to ask if user got a visa
		 * If user got a visa let's ask how long (years) is visa for
		 * if visa is more than 1 year --> cool
		 * if less --> you will have to go back in 1 year and to apply again
		 */
		
		Scanner scan; // declared a variable scan
		boolean visa; // boolean because yes or no
		int years; 
		
		scan=new Scanner(System.in); //capture a value to variable scan
		System.out.println("Hey did you get your visa?"); // message to user
		
		visa=scan.nextBoolean(); // capture boolean value 
		
		if(visa) {
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
