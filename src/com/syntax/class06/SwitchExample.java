package com.syntax.class06;

public class SwitchExample {

	public static void main(String [] args) {
	
		char gender= 'M';
		
		switch(gender) { 
		case 'M':     
			System.out.println(" Male");
			break;
     	// case M //MATCHING CASES ARE NOT ALLOWED
			//System.out.println(" khkhkjhj");
		case 'F':
			System.out.println("Female");
			break;
		default:
				System.out.println("Gender is unknown");
		}
		
		
	}		
		
}
