package com.sise;

public class Solution {
    public int removeElement(int[] nums, int val) {
    	int k = 0;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i]!= val) {
				int temp = nums[i];
				nums[i]= nums[k];
				nums[k++] = temp;
			}
		}
        return k;
    }
}
