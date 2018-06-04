package com.sise;

public class Soultion {
	public boolean isPalindrome(String s) {
		if (s.length() == 0) {
			return true;
		}
		// ¶Ô×²Ö¸Õë
		char[] chars = s.trim().toLowerCase().toCharArray();
		int l = 0, r = chars.length - 1;
		while (l < r) {
			if (!Character.isLetterOrDigit(chars[l])) {
				l++;
			} else if (!Character.isLetterOrDigit(chars[r])) {
				r--;
			} else {
				if (chars[l] == chars[r]) {
					l++;
					r--;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
