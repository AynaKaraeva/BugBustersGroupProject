package com.syntax.class06;

public class Something {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean sunny= true;
		if (sunny) {
			String mood="Happy";  // when the string is inside the if block {} it's not visible outside the block 	
		}else {
			String mood ="Not Happy";
		}
		System.out.println(mood); // that is why this variable isn't visible to main method 
		
	}

}
