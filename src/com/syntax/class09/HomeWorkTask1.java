package com.syntax.class09;

public class HomeWorkTask1{
	
	public static void main (String[] args) {
		
		/*
		 * Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		String [] animals=new String[6];
		
		animals[0]="Dog";
		animals[1]="Cat";
		animals[2]="Tiger";
		animals[3]="Lion";
		animals[4]="Zeebra";
		animals[5]="Monkey";

		
		System.out.println(animals[0]+" "+ animals[1]+ " "+ animals[2]+" "+ animals[3]+" "+ animals[4]+ " "+ animals[5]);
		
		System.out.println("----------------------2nd Way----------------------");
		
		String animal[]= {"Dog", "Cat", "Tiger", "Lion","Zeebra", "Mokey"};
		
		for (int a=0; a<animal.length; a++) {
			System.out.println(animal[a]+" ");
		}
	
		
		System.out.println("-----------------------------------------------------");
		
		for (String an: animal) {
			System.out.println(an);
		}
		
		
		
		
	}

}
