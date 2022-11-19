package com.TYF.arrays;

public class P_03_SockBuyAndSell {

    // brut force approach TC : O(n^2)
    public static int solution_01(int[] arr){
        int maxprofit = 0;
        for(int i=0; i<arr.length; i++){
            int profit = 0;
            for (int j=i; j<arr.length; j++){
                profit = arr[j] - arr[i];
                if(profit>maxprofit){
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }


    //optimized approach o(n)
    public static int solution_02(int[] arr){
        int maxprofit = 0;
        int mini = arr[0];
        int profit = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
            profit = arr[i] - mini;
            maxprofit = Integer.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
