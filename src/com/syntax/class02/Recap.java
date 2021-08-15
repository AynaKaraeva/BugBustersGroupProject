package com.syntax.class02;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 1;
		short s = 10;
		int i = 100; // declare variable and we assign the value
		long l = 109876554433322l;
		float f = 10.99f;
		double dd = 100.9;

		char c = '*';
		boolean bool = false;

		System.out.println(dd);

		// how to change a value of the variable?

		// int i=200; we cannot declare same variable (name) twice!!!

		i = 200; // reassign value
		bool = true;

		System.out.println(bool);

		// can i do this?
		int number = i;

		System.out.println(number);

		number = 500;
		System.out.println(number);

		// number=2.99; error: type mismatch! Why - variable number can hold only
		// integent type of value

		float num = 1.99f;

		/*
		 * to format your code Mac: cmd+shift+f Windows:ctrl+shift+f
		 */

	}

}
