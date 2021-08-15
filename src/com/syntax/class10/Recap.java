package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] array=new String[3];
		array[0]="Hello";
		array[1]="Hi";
		
		//System.out.println(array[3); --> 
		
		System.out.println(array[2]); //null
		
		int size=array.length;
		System.out.println(size);

		array[2]="How are you?";
		System.out.println(array[2]);//How are you?

	}

}
