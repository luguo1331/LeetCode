package com.sise;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reverseX = reverse(x);
        return reverseX == x;
    }

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
