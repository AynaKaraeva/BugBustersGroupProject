package com.syntax.class03;

public class RelationOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 20;
		int num1 = 20;

		System.out.println(num > num1);
		System.out.println(num != num1);
		System.out.println(num < num1);
		System.out.println(num == num1); // == works as equal operation
		System.out.println(num >= num1);

		int a = 100;
		int b = 190;

		boolean boo = a < b; // result of the relational operators ALWAYS a boolean value (true or False)
		System.out.println(boo);

		System.out.println("_________________");

		System.out.println(a == b); // checking for equality
		System.out.println(a = b); // reassigning value of var b to a

		System.out.println(a < b); // false because we reassigned a (190<190)

	}

}
