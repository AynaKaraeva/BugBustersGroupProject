package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		/*
		 * Write a program to ask user to enter value for sale: yes or no if there is no
		 * sale --> you are not going for shopping if there is a sale ask your user for
		 * the item and price of the item Based on the price you have to calculate the
		 * price of the item after the discount if price is less than $20 --> apply 10$
		 * if price is between than $20 & $100 --> apply 20$ if price is between than
		 * $100 & $500 --> apply 30$ otherwise apply 50% discount
		 * 
		 * After discount____the price of the item reduced from ___to
		 */

		Scanner hp = new Scanner(System.in);

		String sale, item;
		double price;
		int discount = 0;
		double finalPrice;

		System.out.println("Is there some sale now?");
		sale = hp.nextLine();

		if (sale.equals("yes")) {
			System.out.println("What would you like to purchase?");
			item = hp.nextLine();

			System.out.println("What is a price of this item?");
			price = hp.nextDouble();

			if (price >= 1 && price < 20) {
				discount = 10;

			} else if (price >= 20 && price < 100) {
				discount = 20;

			} else if (price >= 100 && price < 500) {
				discount = 30;

			} else if (price > 500) {
				discount = 50;
			}

			finalPrice = price - (price * discount / 100);

			System.out.println("After discount " + discount + "% the price of the item reduced from $" + price + " to "
					+ finalPrice);

		} else {
			System.out.println("Sorry no shopping today");
		}

	}
}
