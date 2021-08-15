package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		
		/*
		 * I want to ask where are you from?
		 * based on the country we will define traditional food 
		 */

		Scanner scan=new Scanner(System.in);
		
		String country, traditianalFood;
		
		System.out.println("Where are you from?");
		country=scan.nextLine();
		
		
		switch (country) { //country == USA (equality)
		
		case "USA": 
			traditianalFood= "burger";
			break;
		case "Afganistan":
			traditianalFood= "qabeli palaw";
			break;
		case "Peru":
			traditianalFood= "cevice";
			break;
		case "Italy":
			traditianalFood="pasta";
			break;
		case "Tajikistan":
			traditianalFood="kurtub";
			break;
		case "Ukraine":
			traditianalFood="borsch";
			break;
		case "Kazakhstan":
		    traditianalFood="beshbarmak";
		    break;
		case "Turkey":
		    traditianalFood="borek";
		    break;
		default:
			traditianalFood="unknown";   
			
		}
			System.out.println("You are from " + country + "and your traditian food is " + traditianalFood);
		
		
		
		
	}

	
}
