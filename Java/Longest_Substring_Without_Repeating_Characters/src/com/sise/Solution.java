package com.sise;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	//»¬¶¯´°¿Ú
        int res = 0;
        int freq[] = new int[256];
        char[] chars = s.toCharArray();
        int l = 0 ,r = -1;
        while (l<chars.length) {
			if(freq[chars[r+1]]==0){
				freq[chars[++r]]++;
			}else {
				freq[chars[l++]]--;
			}
			res=r-l+1<res? r-l+1:res;
		}
        return res;
    }
}
