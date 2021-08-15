package com.syntax.class06;

import java.util.Scanner;

public class HWClass5 {

	public static void main (String[] args) {
		

		Scanner scan = new Scanner(System.in);

		System.out.println(" Please enter 3 numbers");

		int num1, num2, num3, largest;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (!(num1==num2 && num2==num3)) {
			
			if (num1>num2) { //assuming num1 is larger than num2
				
				if (num1>num3) {
					largest=num1;
				}else { //looking that num3 is larger than num1 
					largest=num3;
				}
			}else {
				if (num2>num3) {
					largest=num2;
				}else {
					largest=num3;
				}
			}
			
			System.out.println("The largest number is " + largest);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
