package com.TYF.arrays;

public class P_01_SortArrayofZerosAndOnes {
    public static void solOne(int[] arr){
        int ones = 0, twos = 0, zeros =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0)
                zeros++;
            if (arr[i]==1)
                ones++;
            if(arr[i]==2)
                twos++;
        }
        int i=0;
        while (zeros!=0){
            arr[i] = 0;
            i++;
            zeros--;
        }
        while (ones!=0){
            arr[i] = 1;
            i++;
            ones--;
        }
        while (twos!=0){
            arr[i] = 2;
            i++;
            twos--;
        }
    }
}
