package com.TAP.Arrays;

public class BasicArraysProgs {
    /**
     * @param arr
     * @return span of Array i.e span of an Array is
     * difference between maxElement in Array and Min Element in An Array
     */
    public static int spanOfanArray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) maxi = arr[i];
            if (arr[i] < mini) mini = arr[i];
        }
        return maxi - mini;
    }

    /**
     * @param arr
     * @return second-largest element in the Array
     */
    public static int SecondLargestElement(int[] arr) {
        if(arr.length == 1) return arr[0];
        if(arr.length == 0) return -1;
        int maxi,sec_maxi;
        if(arr[0] > arr[1]){
            maxi = arr[0];
            sec_maxi = arr[1];
        }else{
            sec_maxi = arr[0];
            maxi = arr[1];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > maxi) {
                sec_maxi = maxi;
                maxi = arr[i];
            } else if (arr[i] > sec_maxi) {
                sec_maxi = arr[i];
            }
        }
        return sec_maxi;
    }

    /**
     * @param arr
     * @return return the second minimum element in the array
     */
    public static int SecondMinElement(int[] arr) {
        int min,sec_min;
        if(arr.length == 0) return -1;
        if(arr.length == 1) return arr[0];
        if(arr[0] < arr[1]){
            min = arr[0];
            sec_min = arr[1];
        }else{
            min = arr[1];
            sec_min = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                sec_min = min;
                min = arr[i];
            }
            if(arr[i] < sec_min){
                sec_min = arr[i];
            }

        }
        return sec_min;
    }
}

