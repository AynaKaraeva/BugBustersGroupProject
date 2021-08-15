package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		// I want to print how are you 10 times.
		
		
		int i=0;
		
		while (i<10) {
			System.out.println("How are you");
			i++;
		}

		System.out.println(" I want to print numbers from 1 to 20.");
		
		int a=1;
		
		while(a<=20) { 
			System.out.println(a);
			a++;
		}
		
		
		System.out.println(" I want to print numbers from 100 to 110.");
		
		int b=100;
		
		while(b<=110) {
			System.out.print(b+ " ");
			b++;
		}
		
		
		System.out.println(" I want to print numbers from 10 to 1.");
		
		int num=10;
		
		while(num>=1) {
			System.out.print(num+ " ");
			num--;
		}
		
		System.out.println(" I want to print odd numbers from 1 to 20.");
		
		
		int n=1;
		
		while(n<21) {
			System.out.println(n);
			n+=2;
		}
		
		
		n=1;
		
		while(n<21) {
			
			if(n%2!=0) {
				System.out.println(n);	
			}
			n++;
		}
		
		System.out.println("End of code!!!!");
		
	}

}
