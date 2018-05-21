package com.sise;

public class Solution {
    public boolean judgeCircle(String moves) {     
        char[] arr = moves.toCharArray();
        int [] counts = new int[86];
        for(char c: arr){
            counts[c]++;
        }
        return (counts['U']==counts['D']&&counts['R']==counts['L']);
    }
}
