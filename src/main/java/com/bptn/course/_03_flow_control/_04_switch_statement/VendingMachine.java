package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] prices = {2.00, 3.49, 6.75};
		int choice = 0;
		
		do {
			System.out.println("Vending Machine");
			System.out.println("1. Candy: $" + prices[0]);
			System.out.println("2. Chips: $" + prices[1]);
			System.out.println("3. Drink: $" + prices[2]);
			
			System.out.println("What would you like to eat?");
			choice = scanner.nextInt();
			switch (choice) {
				case 1: System.out.println("You selected Candy");
						break;
				case 2: System.out.println("You selected Chips");
						break;
				case 3: System.out.println("You selected Chips");
						break;
			}
			
			System.out.println("How much money are you paying?");
			double money = scanner.nextDouble();
			if (money >= prices[choice - 1]) {
				System.out.println("Enjoy your snack!");
				System.out.println("Your change is $" + (money - prices[choice - 1]));
			} else {
				System.out.println("Not enough change!");
			}
		} while (choice == 0);
		
		scanner.close();

	}

}
