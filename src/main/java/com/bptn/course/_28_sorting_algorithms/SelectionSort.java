package com.bptn.course._28_sorting_algorithms;

public class SelectionSort {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int[] arr) {
        int arrLength = arr.length;
        for (int currOuterIndex = 0; currOuterIndex < arrLength; currOuterIndex++) {
            int smallestElementIndex = currOuterIndex;
            for (int currInnerIndex = currOuterIndex + 1; currInnerIndex < arrLength; currInnerIndex++) {
                if (arr[currInnerIndex] < arr[smallestElementIndex]) {
                    smallestElementIndex = currInnerIndex;
                }
            }
            if (smallestElementIndex != currOuterIndex) {
                swap(arr, smallestElementIndex, currOuterIndex);
            }
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
