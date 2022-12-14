package com.TAP.Arrays;

public class BasicArraysProgs {
    /**
     * @param arr
     * @return span of Array i.e span of an Array is
     * difference between maxElement in Array and Min Element in An Array
     */
    public static int spanOfanArray(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i] > maxi) maxi = arr[i];
            if(arr[i] < mini) mini = arr[i];
        }
        return maxi-mini;
    }

    /**
     * @param arr
     * @return second-largest element in the Array
     */
    public static int SecondLargestElement(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int sec_maxi = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxi){
                sec_maxi = maxi;
                maxi = arr[i];
            }else if(arr[i] > sec_maxi){
                sec_maxi = arr[i];
            }
        }
        return sec_maxi;
    }
}
