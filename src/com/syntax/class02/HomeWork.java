package com.syntax.class02;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Declare variable and increase by first 500 and then 200 using shorthand operator
		 * Declare variable and decrease by 60 using shorthand operator
		 * Declare variable cakePiece=11 and divide cakePiece between 
		 *  4 people using shorthand operator
		 *  Declare variable cake=25 and divide cake between 7 people .
		 *   Using shorthand operator found out how many pieces of cake left after it was
		 *    distributed equally among 7 people
		 */
		
		int hp = 150;
		hp += 500;

		System.out.println(hp);

		
		hp += 200;

		System.out.println(hp);

		int go = 8776;
		go -= 60;

		System.out.println(go);

		int cakePiece = 11;
		cakePiece /= 4;

		System.out.println(cakePiece);

		int cake = 25;
		cake /= 7;
		cake %= 7;

		System.out.println(cake);
		System.out.println(cake);

	}

}
