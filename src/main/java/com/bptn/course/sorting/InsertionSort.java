package com.bptn.course.sorting;

public class InsertionSort {

	public static void sort(int[] arr) {
		int unsortedIndex = 1;
		int arrLength = arr.length;
		while (unsortedIndex < arrLength) {
			int currElementIndex = unsortedIndex;
			while (currElementIndex >= 1 && arr[currElementIndex - 1] > arr[currElementIndex]) {
				int temp = arr[currElementIndex];
				arr[currElementIndex] = arr[currElementIndex - 1];
				arr[currElementIndex - 1] = temp;
				currElementIndex--;
			}
			unsortedIndex++;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 0, 6, 3, 4, 2, 7, 1, 9, 8, 5 };
		int arrLength = arr.length;
		System.out.println("Unsorted arr: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
		}
		sort(arr);
		System.out.println("Sorted arr: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
		}
	}

}
