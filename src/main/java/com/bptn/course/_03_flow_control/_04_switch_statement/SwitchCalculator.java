package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please choose an item from the list: ");
		System.out.println("1. Pizza - $12.99");
		System.out.println("2. Burger - $8.99");
		System.out.println("3. Pasta - $9.99");
		System.out.println("4. Salad - $6.99");
		System.out.println("5. Exit");
		
		scanner.close();
		
	}

}
