package com.bptn.course.sorting;

public class SelectionSort {

	public static void sort(int[] arr) {
		int pointer = 0;
		int arrLength = arr.length;
		while (pointer < arrLength) {
			int minIndex = pointer;
			for (int i = pointer + 1; i < arrLength; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}

			if (pointer != minIndex) {
				int temp = arr[pointer];
				arr[pointer] = arr[minIndex];
				arr[minIndex] = temp;
			}

			pointer++;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 0, 6, 3, 4, 2, 7, 1, 9, 8, 5 };
		System.out.println("Unsorted arr: ");
        for (int j : arr) {
            System.out.println(j);
        }
		sort(arr);
		System.out.println("Sorted arr: ");
        for (int j : arr) {
            System.out.println(j);
        }
	}

}