package com.syntax.class04;

//shortcut to import: mac-> cmd+shift+o  window--> ctrl+shift+o

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		
		String name = "Serge";
		System.out.println("Hello "+ name);
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enetr your name");
		
		//capture String values and we stored inside variable value
		String name1 = scan.nextLine();
		
		System.out.println("Hello " + name1);
		
		//capture integer value 
		System.out.println("PLease enter your age");
		int age = scan.nextInt();
		System.out.println(name1+ " is " + age + " years old ");
		
		
	}
}
