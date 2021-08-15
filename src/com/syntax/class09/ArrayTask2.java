package com.syntax.class09;

public class ArrayTask2 {
	
	public static void main (String[] args) {
		
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F.
		 * Then print a grade B
		 * Shorter Way
		 */
		
		
        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        
		int size=ch.length;//gives the size -> how many elements in that array
		System.out.println(size);
		
		System.out.println(ch[1]);
		
		int i=0;
		System.out.println(ch [1]); //i='A'
		
		i++;
		System.out.println(ch[1]); //i='A'+1='B'
		
		
		System.out.println("---------------RETRIEVING ALL VALUES USING FOR LOOP----------------------");
		
		for (int j=0; j<ch.length; j++) { 
			System.out.println(ch[j]);
		}
		
		
		
		System.out.println("---------------------------------------------------");
		
		
		String[] names= {"Olena", "Elena", "Maria", "SergeC", "Sergei", "Andrei", "Eugene", "Ayna"};
		
		for (int a=0; i<names.length; a++) {
		
		System.out.println(names[a]);
		
		}
		
	System.out.println("-------ANOTHER TASK-------------");
		
		/*
		 * Create an array of words: Java, Saturday, day, coding, is.
		 * Print the following sentence using elements of array: "Saturday is Java coding day".
		 */
	
		String[] code=new String[5];
		code[0]="Java";
		code[1]="Saturda";
		code[2]="day";
		code[3]="coding";
		code[4]="is";
		System.out.println(code[1]+ " " +code[4]+ " " +code[0]+ " " +code[3]+ " " +code[2]+ ".");
		
		
		System.out.println("-----------SHORTER WAY------------------");
		
		
		String[] day={"Java", "Saturday","day", "coding","is"};
		System.out.println(code[1]+ " " +code[4]+ " " +code[0]+ " " +code[3]+ " " +code[2]+ ".");
		
		
		
		
	
		
		
		
		
		}
	}
	