package com.sise;

public class Solution {
    public int findComplement(int num) {
        int bits = 0;
        int temp = num;
        while(temp != 0){
            bits++;
            temp/=2;
        }
        return num ^(int)(Math.pow(2,bits)-1);
    }
}
