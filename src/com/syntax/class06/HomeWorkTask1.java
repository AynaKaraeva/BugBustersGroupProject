package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkTask1 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter yor country of origin");

		String country, language;
		country = scan.nextLine();
		language = scan.nextLine();

		switch (country) {
		case "USA":
			language = "English";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "France":
			language = "French";
		case "Spain":
			language= "Spanish";
		case "Italy":
			language="Italian";
			break;
			default:
				language = "unknown";
				
				
		}
		System.out.print("You are from "+ country+ " and you speak " +language+ " language.");
		
		
		
	}

}
