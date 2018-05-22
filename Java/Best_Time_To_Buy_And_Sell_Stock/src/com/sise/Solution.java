package com.sise;

public class Solution {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int start = Integer.MAX_VALUE;;
		for (int i = 0; i < prices.length-1; i++) {
			if (prices[i]<start) {
				start = prices[i];
			}
			if (prices[i+1]>start&&prices[i+1]-start>profit) {
				profit =prices[i+1]-start;
			}
		}
		return profit;
	}
}
