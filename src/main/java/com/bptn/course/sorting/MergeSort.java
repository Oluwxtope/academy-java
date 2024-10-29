package com.bptn.course.sorting;

public class MergeSort {

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low >= high) {
			return new int[] {arr[low]};
		}
		int mid = (high + low) / 2;
		int[] first = mergeSort(arr, low, mid);
		int[] second = mergeSort(arr, mid + 1, high);
		return merge(first, second);
	}

	public static int[] merge(int[] first, int[] last) {
		int lenFirst = first.length;
		int lenLast = last.length;
		int[] res = new int[lenFirst + lenLast];
		int p1 = 0, p2 = 0, pRes = 0;

		while (p1 < lenFirst && p2 < lenLast) {
			if (first[p1] <= last[p2]) {
				res[pRes++] = first[p1++];
			} else {
				res[pRes++] = last[p2++];
			}
		}

		while (p1 < lenFirst) {
			res[pRes++] = first[p1++];
		}

		while (p2 < lenLast) {
			res[pRes++] = last[p2++];
		}

		return res;
	}


	public static void main(String[] args) {
		int[] arr = { 0, 6, 3, 4, 2, 7, 1, 9, 8, 5 };
		System.out.println("Unsorted arr: ");
        for (int k : arr) {
            System.out.println(k);
        }
		int[] sortedArr = mergeSort(arr, 0, arr.length - 1);
		System.out.println("Sorted arr: ");
        for (int j : sortedArr) {
            System.out.println(j);
        }
	}

}
