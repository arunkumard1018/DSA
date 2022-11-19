package com.leetcode.arrays;

public class P_01 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;

        int candies = 0;
        int[] arr = new int[k];
        int candi = 1;//123 3
        for(int i=0; i<k; i++){
            if(candies <= n){
                arr[i] = candi+arr[i];
                candies += candi+arr[i];
            }
        }
    }
}
