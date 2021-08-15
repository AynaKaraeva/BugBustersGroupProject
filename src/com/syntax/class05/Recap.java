package com.syntax.class05;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {

		String str; // declaring variable str
		str = "some value"; // initializing a value of the variable

		Scanner input; // declaring input
		input = new Scanner(System.in);

		int num = input.nextInt();
		System.out.println(num);

		char singleChar = input.next().charAt(0); // takes first character form a string, index 0 means 1st character
		System.out.println(singleChar);

		str = input.next(); // replace a value // next - capture the word before space
		System.out.println(str);

		input.nextLine(); // nextLine - able to capture entire line

		str = input.nextLine(); // replacing a value
		System.out.println(str);

	}

}
