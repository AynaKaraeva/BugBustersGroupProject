package com.syntax.class06;

import java.util.Scanner;

public class HWClass05 {
	
	public static void main(String[] args) {

		/*
		 * Home Work from class 05 HomeWork1
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your quiz score");
		int quiz = scan.nextInt();

		System.out.println("Please enter your midterm score");
		int midterm = scan.nextInt();

		System.out.println("Please enter your finil score");
		int finil= scan.nextInt();
		
		int score=(quiz+midterm+finil)/3;
		char grade;
		
		
		if (score>=90) {
			grade='A';
		}else if (score>=70 && score<=90) {
			grade='B';
		}else if (score>=50 && score<=70) {
			grade='C';
		}else {
			grade='F';	
		}
		
		System.out.println("With average score = "+score+ " your grade is " + grade);
		
		
		
	System.out.println("--------------------------------------------------);	
		
	
	
		
		
		
		
		
		
		}	
	}
		
		
	


