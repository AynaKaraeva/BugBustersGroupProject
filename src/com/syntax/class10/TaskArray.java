package com.syntax.class10;

public class TaskArray {
	
	public static void main (String []args) {
		
		/*
		 * Create an array of countries. While retrieving all values from an array
		 * print capital for each country.(use 2 different loops)
		 */
		
		String [] c=new String[7];
		
		c[0]="USA";
		c[1]="Russia";
		c[2]="Ukrain";
		c[3]="Turkmenistan";
		c[4]="Morocco";
		c[5]="Cuba";
		c[6]="France";
		
		
		for (int i=0; i<c.length; i++) {
			
			System.out.print(c[i]+ " ");
		}
		
		
		String[] country= { "USA", "Russia", "Ukrain", "Turkmenistan"};
		String capital= " ";
		
		
           for (int i=0; i<country.length; i++) {
			
			System.out.print(country[i]+ " ");
		}
		
           for (String countries:country) {
        	  if(country.equals("USA")) {
        		  capital="Washington DC";
        	  }else if (country.equals("Russia")) {
        		  capital="Moscow";
        	  }else if (country.equals("Ukrain")) {
        		  capital="Kiev";
        	  }
           }
		
		
		
		
	}
	
	

}
