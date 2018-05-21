package com.sise;

public class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            char temp = arr[i];
            int last =len-1-i;
            arr[i]=arr[last];
            arr[last]=temp;
        }
        return String.valueOf(arr);
    }
}
