package com.bptn.course._04_arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// Given 2D array, find max element in each row
		int[][] twoDimensionalArray = {
				{85, 90},
				{33, 20},
				{10, 1}
		};
		
		for (int i = 0; i <= 2; i++) {
			int maxInRow = twoDimensionalArray[i][0];
			for (int j = 1; j <= 1; j++) {
				int curr = twoDimensionalArray[i][j];
				if (curr > maxInRow) {
					maxInRow = curr;
				}; 
				System.out.println(maxInRow);
			}
		}

	}

}
