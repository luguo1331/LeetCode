package com.sise;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length-1;
        while (l<r) {
        	int num = numbers[l]+numbers[r];
			if (num ==target) {
				int[] nums = {l+1,r+1};
				return nums;
			}else if (num>target) {
				r--;
			}else {
				l++;
			}
		}
		return null;
    }
}
