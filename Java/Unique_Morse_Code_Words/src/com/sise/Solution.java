package com.sise;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int uniqueMorseRepresentations(String[] words) {
		String[] translates = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
				"-.--", "--.." };
		HashSet<Object> result = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			char[] arr = words[i].toCharArray();
			StringBuilder sb = new StringBuilder();
			for (char c : arr) {
				sb.append(translates[c - 'a']);
			}
			result.add(sb.toString());
		}
		return result.size();
	}
}
