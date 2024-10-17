package com.bptn.course.sorting;

public class QuickSort {
	public static void sort(int[] arr, int low, int high) {
		return;
	}

	public static int partition(int[] arr, int low, int high) {
		return 1;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 6, 3, 4, 2, 7, 1, 9, 8, 5 };
		int arrLength = arr.length;
		System.out.println("Unsorted arr: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
		}
		sort(arr, 0, 1);
		System.out.println("Sorted arr: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
		}

		int x = 2;
		int y = 5;

		while (y > 2 && x < y) {
			x = x + 1;
			y = y - 1;
		}
		System.out.println(x + " " + y);
	}

}
