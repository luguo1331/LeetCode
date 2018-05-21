package com.sise;

public class Solution {
	/**
	 * ��ÿ2K���ַ�ǰK���ַ���ת �������K�������н��з�ת
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public String reverseStr(String s, int k) {
		//
		char[] chars = s.toCharArray();
		// �ж��ٸ�k
		int len = chars.length / k;
		// ��������K ��ת
		for (int i = 1; i <= len; i = i + 2) {
			// ��ʼ 0- k-1 2k - 3k -1
			int start = (i - 1) * k;
			int end = i * k - 1;
			change(start, end, chars);
		}
		// �ж�len����������ż���������ż������Ҫ������ķ�ת
		if (len % 2 == 0) {
			// �����ķ�ת
			int end = chars.length - 1;
			int start = len * k;
			change(start, end, chars);
		}
		return new String(chars);
	}

	/**
	 * ��ת�ַ���
	 * 
	 * @param start
	 * @param end
	 * @param chars
	 */
	public void change(int start, int end, char[] chars) {
		while (start < end) {
			char tmp = chars[start];
			chars[start] = chars[end];
			chars[end] = tmp;
			start++;
			end--;
		}
	}
}
