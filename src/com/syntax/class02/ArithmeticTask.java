package com.syntax.class02;

public class ArithmeticTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a Java program to add, subtract, multiply and divide 2 decimal values.
		 * Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
		 */

		int ice1 = 67;
		int ice2 = 35;
		int add = ice1 + ice2;
		int subtract = ice1 - ice2;
		int multiply = ice1 * ice2;
		int divide = ice1 / ice2;

		System.out.println(" The addition of 2 numbers " + ice1 + " and " + ice2 + "is equal to " + add);
		System.out.println(" The subtact of 2 numbers " + ice1 + " and " + ice2 + "is equal to " + subtract);
		System.out.println(" The multiplication of 2 numbers " + ice1 + " and " + ice2 + "is equal to " + multiply);
		System.out.println(" The divison of 2 numbers " + ice1 + " and " + ice2 + "is equal to " + divide);

		// other way

		double result, om1, om2;
		om1 = 8.01;
		om2 = 5.05;
		result = om1 + om2;
		String act = "add";
		System.out.println(" The " + act + " of 2 numbers " + om1 + " and " + om2 + " is equal to " + result);

		/*
		 * Write a program to find the square of the number 3.9. You program should say
		 * “The square of the ____ is ____ ”
		 */

		float box = 3.9f;
		float square = 3.9f * 3.9f;
		System.out.println(" The square of the " + box + " is " + square);

		/*
		 * Write a program to print the area and perimeter of a rectangle with width = 5
		 * and height = 8. Your program should say. “The perimeter of a rectangle with
		 * width ___ and height ____ is equal to _____ and the area is __”
		 */

		int width = 5;
		int height = 8;
		int per = (width + height) * 2;
		int area = width * height;
		System.out.println(" The perimetr of a rectangle with width " + width + " and height " + height
				+ " is equal to " + per + " and the eare is " + area);

	}

}
