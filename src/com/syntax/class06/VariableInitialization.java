package com.syntax.class06;

import java.io.InputStream;
import java.util.Scanner;

public class VariableInitialization {

	public static void main(String[] args) {
	
		/*
		 * ask user to enter name and age
		 * based on age who is user
		 * if age is from 03--> baby
		 * ---------------3-5--> toddler
		 * ---------------5-12-->kid
		 * ---------------12-19-->teenage
		 * ---------------19-65-->adult
		 * ---------------65+ --> senior
		 */

		Scanner in= new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name=in.nextLine();
		
		System.out.println("Please enter your age");
		int age=in.nextInt();
		
		String whoAreYou=null; //declared variable no value // NULL when we do not use else 
		
		if (age>=0 && age<3) { //initialized
			whoAreYou="baby";
			
		}else if (age>=3 && age<6) {
			whoAreYou="toddler";
			
		}else if (age>=6 && age<13) {
			whoAreYou="kid";
			
		}else if (age>=13 && age<20) {
			whoAreYou="teenager";
			
		}else if (age>=20 && age<65) {
			whoAreYou="adult";
			
		}else if (age>=65) {
			whoAreYou="senior";
		}
		
		if (whoAreYou!=null) {
			System.out.println(name+ " you are " +whoAreYou);
		}
		
		
		
		
		
	}

}
