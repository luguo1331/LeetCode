package com.sise;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		if (len <= 2)
			return len;
		int k = 1;
		for (int i = 2; i < len; i++) {
			if (nums[k] != nums[i] || nums[k - 1] != nums[i]) {
				nums[++k] = nums[i];
			}
		}
		return k + 1;
	}
}
