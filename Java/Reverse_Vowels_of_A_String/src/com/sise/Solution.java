package com.sise;

public class Solution {
	public String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		int r = chars.length - 1;
		int l = 0;
		while (l < r) {
			if (!isVowsls(chars[l])) {
				l++;
			} else if (!isVowsls(chars[r])) {
				r--;
			} else if (isVowsls(chars[l]) && isVowsls(chars[r])) {
				char temp = chars[l];
				chars[l++] = chars[r];
				chars[r--] = temp;
			}
		}
		return String.valueOf(chars);
	}

	public boolean isVowsls(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U';
	}
}
