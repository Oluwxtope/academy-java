package com.bptn.course.junit;

public class BinarySearch {
	public int BinarySearch(int[] list, int target) {
		int startIndex = 0;
		int endIndex = list.length - 1;
		while (startIndex <= endIndex) {
			int midIndex = (startIndex + endIndex) / 2;
			int midElement = list[midIndex];
			if (midElement == target) {
				return midIndex;
			} else if (midElement > target) {
				endIndex = midIndex - 1;
			} else {
				startIndex = midIndex + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

	}
}
