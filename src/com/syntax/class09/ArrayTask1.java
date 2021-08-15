package com.syntax.class09;

public class ArrayTask1 {

	public static void main (String[] args) {
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F.
		 * Then print a grade B
		 */
		
		
		
		char[] ch=new char[6];
		ch[0]='A';
		ch[1]='B';
		ch[2]='C';
		ch[3]='D';
		ch[4]='E';
		ch[5]='F';
		
		System.out.println(ch[1]);
		
		
		 
		System.out.println("-------------------------------------------");
		
		/*
		 * Create an array of names and store all names from your group.
		 * Then print your name from that array
		 */
		
		String[] team=new String[8];
		
		team[0]="Olena";
		team[1]="Elena";
		team[2]="Maria";
		team[3]="SergeC";
		team[4]="Serge";
		team[5]="Andrei";
		team[6]="Eugene";
		team[7]="Ayna";
		
		System.out.println(team[7]);
		
		int size=team.length;
		System.out.println(size);
		

		//declaration and storing values must be completed right away
		
		String[] names= {"Olena", "Elena", "Maria", "SergeC", "Sergei", "Andrei", "Eugene", "Ayna"}; //SHORTER WAY
		System.out.println(names[5]);
		
		
		names[5]="Enes"; // Andrei was changed to Enes
		System.out.println(names[5]);
		
		
		
		System.out.println("--------------------------------------------");
		
		
		int[] num;
		num=new int[2];
		num[0]=1;
		num[1]=10;
		
		int[] n;
		//n= {10, 20}; not possible to add value this way after declaration
		
		int[] array= {10, 20, 30, 40,50}; //SHORTER WAY
		
	

		
		
		
		
		
		
		
	}
	
	
	
}
