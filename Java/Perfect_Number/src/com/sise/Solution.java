package com.sise;

public class Solution {
	public boolean checkPerfectNumber(int num) {
		if (num == 1) {
			return false;
		}
		int result = 1;
		for (int i = 2; i < (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				result += num / i;
			}
		}
		System.out.println(result);
		return result == num;
	}
}
