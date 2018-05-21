package com.sise;

public class Solution {
    public int[] twoSum(int[] nums, int target) {  
        int[] result = new int[2];       
        for(int i = 0,len = nums.length;i<len;i++){  
            for(int j = i+1;j<len;j++){  
                 int k = nums[i]+nums[j];    
                if(k==target){  
                    result[0] = i;  
                    result[1] = j;  
                }  
            }  
        }  
        return result;  
    } 
}
