package com.TAP.bitmanipulation;

/**
 * problem given an input array {1,3,2,3,2,4,5,6,4,5,1}
 * O/p to return a lonely  Integer i.e 6
 */
public class P_01_LonelyInteger {

    public static int solution(int[] arr){
        int val  = 0;
        for(int i=0; i<arr.length; i++){
            val = val ^ arr[i];
        }
        return val;
    }
}
