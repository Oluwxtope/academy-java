package com.bptn.course._15_generics;

public class GenericsDemo {
	
	public static <T> void printArray(T[] array) {
		for (T element: array) {
			System.out.println(element);
		}
	}
	
	public static <MyType> void printArrayTwo(MyType[] array) {
		for (MyType element: array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3};
		String[] stringArray = {"hello", "hi"};
		
		printArray(intArray);
		printArray(stringArray);

	}

}
