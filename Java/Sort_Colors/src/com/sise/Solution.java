package com.sise;

import java.util.Arrays;

public class Solution {
	public void sortColors(int[] nums) {
		//ģ��һ����·����
		// [0,zore]�����ﶼ��0
		// [zore+1,two-1]�����ﶼ��1
		// [two,n-1]�����ﶼ��2
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
