package com.sise;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null)return 0;
        if(prices.length<2)return 0;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            maxProfit+= Math.max(0,prices[i]-prices[i-1]);
        }
        return maxProfit;
    }
}
