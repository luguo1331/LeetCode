package com.sise;

public class Solution {
    public boolean isHappy(int n) {
        while (true) {
			n = getSum(n);
			if (n==4) {
				break;
			}
			if (n==1) {
				return true;
			}
		}
        
        return false;
    }
    
    public int getSum(int num){
    	int sum = 0;
    	int temp ;
    	while (num!=0) {
			temp = num%10;
			num/=10;
			sum +=temp*temp;
		}
    	return sum;
    }
}
