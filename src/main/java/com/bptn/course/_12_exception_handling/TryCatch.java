package com.bptn.course._12_exception_handling;

import java.util.ArrayList;
import java.util.Iterator;

public class TryCatch {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(8);
		numbers.add(2);
		numbers.add(23);
		numbers.add(3);
		numbers.add(5);
		// 0-1-2---3---4-5 numbers array list indices
		// [12, 8, 2, 23, 3, 5] - numbers array list
		// ^

		Iterator<Integer> it = numbers.iterator();
		int pointer = 0;

		while (it.hasNext()) {
			int element = it.next();
			if (pointer % 2 == 0) {
				it.remove();
			}
			pointer++;
		}
		System.out.println(numbers);

//		while (it.hasNext()) {

//		}
//		

//		Scanner scanner = new Scanner(System.in);
//
//		int choice = 5;
//
//		do {
////			SHOW MENU
//			System.out.println("Calculator");
//			System.out.println("1. Add");
//			System.out.println("2. Subtract");
//			System.out.println("3. Multiply");
//			System.out.println("4. Divide");
//			System.out.println("5. Exit");
//
//			System.out.println("Please choose: ");
//			choice = scanner.nextInt();
//
//			System.out.println("Enter the first number: ");
//			int num1 = scanner.nextInt();
//			System.out.println("Enter the second number: ");
//			int num2 = scanner.nextInt();
//
//			System.out.println("The result is: ");
//
//			switch (choice) {
//			case 1:
//				try {
//					int add = num1 + num2;
//					System.out.println(add);
//				} catch (Exception e) {
//					System.out.println("There was an error, please try again!");
//				}
//				break;
//
//			case 2:
//				try {
//					if (num1 >= num2) {
//						int subtract = num1 - num2;
//						System.out.println(subtract);
//					} else {
//						Exception e = new Exception("The first number has to be greater than the second number!");
//						throw e;
//					}
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//
//			case 3:
//				try {
//
//					if (num1 < 0 && num2 < 0) {
//						ArithmeticException e = new ArithmeticException("Both numbers have to be greater than 0!");
//						throw e;
//					} else if (num1 < 0 || num2 < 0) {
//						Exception e = new Exception("One number is less than 0!");
//						throw e;
//					} else {
//						int res = num1 * num2;
//						System.out.println(res);
//					}
//
//				} catch (ArithmeticException e) {
//					System.out.println(e.getMessage());
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//
//			case 4:
//			}
//
//		} while (choice != 5);
//
//		scanner.close();

	}
}
