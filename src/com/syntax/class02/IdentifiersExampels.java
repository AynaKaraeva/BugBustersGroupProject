package com.syntax.class02;

public class IdentifiersExampels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// RULES:
		/*
		 * Identifiers - name we give to classes, variable and methods Keyword cannot be
		 * used as Identifiers Identifiers cannot start with number Identifiers cannot
		 * have with special character expect: _ AND $
		 */

		char singleletter = 'c';

		// boolean new=true; do not use keyword to name your variable

		// int 1num=100; // error
		int num1 = 100;

		boolean boo = true;
		double $price = 2.99;
		// byte ˆb=1; --> error

		// Preferences:
		/*
		 * follow camel casing Java Classes should start with upper case and follow
		 * camel casing variables and methods in Java should start with lower cases and
		 * follow camel casing
		 * 
		 */

		short thisIsMyShortNumber = 10;
		System.out.println(thisIsMyShortNumber);

	}

}
