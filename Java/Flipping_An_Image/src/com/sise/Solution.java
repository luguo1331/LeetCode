package com.sise;

public class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			int length = A[i].length;
			int[] new_arr = new int[length];
			for (int j = 0; j < length; j++) {
				new_arr[j] = A[i][length - j - 1];
				new_arr[j] = 1 ^ new_arr[j];
			}
			A[i] = new_arr;
		}
		return A;
	}
}
