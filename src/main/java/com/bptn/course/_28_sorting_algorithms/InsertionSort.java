package com.bptn.course._28_sorting_algorithms;

public class InsertionSort {

    public static void sort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 1; i < arrLength; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 6, 3, 4, 2, 7, 1, 9, 8, 5};
        System.out.println("Unsorted arr: ");
        for (int k : arr) {
            System.out.println(k);
        }
        sort(arr);
        System.out.println("Sorted arr: ");
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
