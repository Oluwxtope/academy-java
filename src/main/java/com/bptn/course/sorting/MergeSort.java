package com.bptn.course.sorting;

public class MergeSort {

	public static int[] mergeSort(int[] arr) {
		int arrLength = arr.length;
		if (arrLength <= 1) {
			return arr;
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 0, 6, 3, 4, 2, 7, 1, 9, 8, 5 };
		int arrLength = arr.length;
		System.out.println("Unsorted arr: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
		}
		mergeSort(arr);
		System.out.println("Sorted arr: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
		}
	}

}
