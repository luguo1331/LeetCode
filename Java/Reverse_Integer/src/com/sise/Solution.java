package com.sise;

public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (Math.abs(result) > (Integer.MAX_VALUE - Math.abs(x % 10)) / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
