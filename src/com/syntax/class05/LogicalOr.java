package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// true || true = true
		// true || false = true
		// false || false = false
		// false || true = true

		/*
		 * define a day if day is Monday or Friday -> No class if day is Tuesday or
		 * Wednesday -> Manual Class if day is Thursday -> Review Class if day is Sat or
		 * Sunday -> Java Class
		 */

		String day = "Saturday";

		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("We have no class at Syntax");

		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today is manual class");

		} else if (day.equals("Thursday")) {
			System.out.println("Today is our review class");
		} else if (day.equals("Saturday")){
			System.out.println("Today is mya favorite Java Class");
		} else {
			System.out.println("Please specify valid day");
		}

	}

}
