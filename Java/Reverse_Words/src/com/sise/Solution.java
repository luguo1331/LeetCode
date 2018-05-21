package com.sise;

public class Solution {
	public String reverseWords(String s) {
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String str : arr) {
			char[] charArray = str.toCharArray();
			int len = charArray.length;
			for (int i = 0; i < len/2; i++) {
				char temp = charArray[len-i-1];
				charArray[len-i-1] = charArray[i];
				charArray[i]=temp;				
			}
			sb.append(String.valueOf(charArray)+" ");
		}
		sb.setLength(sb.length()-1);
		return sb.toString();
	}
}
