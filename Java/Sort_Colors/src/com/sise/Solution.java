package com.sise;

import java.util.Arrays;

public class Solution {
	public void sortColors(int[] nums) {
		//模仿一次三路快排
		// [0,zore]区间里都是0
		// [zore+1,two-1]区间里都是1
		// [two,n-1]区间里都是2
		int zore = -1;
		int two = nums.length;
		for (int i = 0; i < two;) {
			if (nums[i] == 1) {
				i++;
			}
			else if (nums[i] == 2) {
				swap(nums,i,--two);
			}
			else if (nums[i] == 0) {
				swap(nums,++zore, i++);
			}
		}
	}
	public void swap(int[] nums,int start, int end) {
		int temp = nums[start];
		nums[start]= nums[end];
		nums[end] = temp;
	}
}
