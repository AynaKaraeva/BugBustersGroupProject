package com.syntax.class04;

public class IfTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 */

		int age = 25;
		double weight = 160;

		if (age >= 18) {
			System.out.println("Let's check if you meet all the requirements");

			if (weight > 100) {
				System.out.println("You can donate");
			} else {
				System.out.println("You can not donate");
			}
		} else {
			System.out.println("You are not eligibale for donation");
		}

	}

}
