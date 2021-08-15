package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your quiz score");
		int quiz = scan.nextInt();

		System.out.println("Please enter your midterm score");
		int midterm = scan.nextInt();

		System.out.println("Please enter your finil score");
		int finil= scan.nextInt();
		
		int score=(quiz+midterm+finil)/3;
		
		if (score>=90) {
			System.out.println("Grade A");
		}else if (score>=70 && score<=90) {
			System.out.println("Grade B");
		}else if (score>=50 && score<=70) {
			System.out.println("Grade C");
		}else {
		System.out.println("Grade F");
		
		
		}
		
	}

}
