package com.sise;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Solution {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (judge(i)) {
				result.add(i);
			}
		}
		return result;
	}

	public boolean judge(int num) {
		int temp = num;
		while (temp != 0) {
			if (temp % 10 == 0 || num % (temp % 10) != 0) {
				return false;
			}
			temp /= 10;
		}
		return true;
	}
}
