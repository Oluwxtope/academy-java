package com.bptn.course._28_sorting_algorithms;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int low, int high) {
        if  (low >= high) {
            return new int[] {arr[low]};
        }

        int mid = (low + high) / 2;
        int[] leftHalf = mergeSort(arr, low, mid);
        int[] rightHalf = mergeSort(arr, mid + 1, high);
        return merge(leftHalf, rightHalf);
    }

    public static int[] merge(int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;

        int[] res = new int[leftLength + rightLength];
        int pLeft = 0, pRight = 0, pRes = 0;

        while (pLeft < leftLength && pRight < rightLength) {
            int leftElement = leftHalf[pLeft];
            int rightElement = rightHalf[pRight];
            if (leftElement <= rightElement) {
                res[pRes] = leftElement;
                pLeft++;
            } else {
                res[pRes] = rightElement;
                pRight++;
            }
            pRes++;
        }

        while (pLeft < leftLength) {
            res[pRes] = leftHalf[pLeft];
            pLeft++;
            pRes++;
        }

        while (pRight < rightLength) {
            res[pRes] = rightHalf[pRight];
            pRight++;
            pRes++;
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
