package com.syntax.class09;

public class AnotherClockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("-----------ANOTHER SOLUTION --(SERGE'S CODE)------------");

		String min = "", hour = "";

		for (int h = 0; h <= 23; h++) {

			for (int m = 0; m <= 59; m++) {

				if (h < 10) {
					hour = "0" + h;
				} else {
					hour = "" + h;
				}

				if (m < 10) {
					min = "0" + m;
				} else {
					min = "" + m;
				}

				System.out.println(hour + ":" + min);
			}
		}

		
		
		
		

	}

}
