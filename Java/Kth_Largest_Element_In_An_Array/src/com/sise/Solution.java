package com.sise;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
      findNum(nums, 0, nums.length-1, k);
      for (int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
	}
      return nums[nums.length-k];
    }
    
    public void findNum(int[] arr,int l, int r, int k ){
    	if (l>=r) {
			return;
		}
    	int p = partition(arr, l, r);
    	if (k==(arr.length-p)) {
			return;
		}else if (k>(arr.length-p)) {
			findNum(arr,l,p-1,k);
		}else if(k<(arr.length-p)){
			findNum(arr,p+1,r,k);
		}
    }
    
    public int partition(int[] arr, int l ,int r){
    	int v = arr[l];
    	int j = l;// arr[l+1...j] < v ; arr[j+1...i) > v
    	for (int i = l+1; i <= r; i++) {
			if (arr[i]<v) {
				swap(arr,i,++j);
			}
		}
    	swap(arr, j, l);
    	return j;
    }
	public void swap(int[] nums,int start, int end) {
		int temp = nums[start];
		nums[start]= nums[end];
		nums[end] = temp;
	}
   
}
