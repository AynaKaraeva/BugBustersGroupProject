package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a Java program and name it Variables In your program create different
		 * type of variables to store student’s information(name, last name, grade,
		 * city, state, phone number) and then print value of those variables in the
		 * format: My name is ___ and my last name is ____ I am A/B student I live in
		 * city__ and state____ And my phone number is …..
		 * 
		 * b) Change student’s city, state, phone number and grade. And print those
		 * updated values: Example: My name is __ and I moved to new city__ and new
		 * state__. My new phone number is ____
		 */

		String name = "Ayna";
		String ln = "Karaeva";
		char p = '.';
		String student = "I am A/B student";
		String city = "New York";
		String st = "NY";
		String ph = "phone";
		String num = "1-345-322-567";

		System.out.println("My name is " + name + " and my last name is " + ln + p);
		System.out.println(student + p);
		System.out.println("I live in city " + city + " and stste " + st + p);
		System.out.println("And my " + ph + " number is " + num + p);

		name = "Nata";
		ln = "Kar";
		student = "I am D student";
		city = "New Jersey";
		st = "NJ";
		num = "1-765-876-98";

		System.out.println("My name is " + name + " and my last name is " + ln + p + " I live in city " + city
				+ " and state " + st + p + " And my " + ph + " number is " + num + p);

	}

}
