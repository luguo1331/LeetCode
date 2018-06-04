package com.sise;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	//将两个数组合并
    	int len = m+n;
    	int aux[] = new int[len];
        for (int i = 0; i <n ; i++) {
			nums1[m+i]=nums2[i];
		}
        for (int i = 0; i < nums1.length; i++) {
			aux[i]=nums1[i];
			
		}
        //再执行一次归并排序
        int l = 0;//第一組第一個
        int j = m;//第二組第二個
        for (int i = 0; i < len; i++) {
			if (l>=m) {
				nums1[i]= aux[j++];
			}else if (j>=len) {
				nums1[i]= aux[l++];
			}else if (aux[l]>aux[j]) {
				nums1[i] = aux[j++];
			}else {
				nums1[i] = aux[l++];
			}
		}
    }
}
