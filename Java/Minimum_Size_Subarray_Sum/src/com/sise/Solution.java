package com.sise;

public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		int l = 0;
		int r = -1;
		int len = nums.length;
		int res = len + 1;
		int sum = 0;
		
		while (l<len) {
			if (r+1<len&&sum<s) {
				sum = sum + nums[++r];
			}else {
				sum = sum -nums[l++];
			}
			if (sum>=s&&r-l+1<res) {
				res = r-l+1;
			}
		}
		
	}
}
