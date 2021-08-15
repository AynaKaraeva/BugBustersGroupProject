package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// true && true = true = if
		// true && false = false = else
		//false && false = false = else
		//false && true = false = else
		
		boolean understandJava=true;
        boolean enjoy=true;
		
		if(understandJava && enjoy) {
			System.out.println("That is awesom");
		}else {
			System.out.println("Please try to spend time more Java");
		}
		
		
		/*
		 * declare a number
		 * if number is larger 1 and smaller than 10 --> SMALL
		 * if number is larger than 10 but smaller than 100 --> MEDIUM
		 * if number is larger than 100 but smaller than 1000 --> LARGE
		 * otherwise number is huge
		 */
		
		int num=54; //only if number is positive 
		
		//int num=0;
		//if (num>0) {
		
		if (num>1 && num<10) {
			System.out.println("Number is small");
			
		}else if (num>10 && num<100) {
			System.out.println("Number is medium");
			
		}else if (num>100 && num<1000) {
			System.out.println("Number is large");
			
		}else {
			System.out.println("Number is huge");
		}
		
		// } else {
		// System.out.println("Number is either 0 or negative");
		//}
		
		
		
	}

}
