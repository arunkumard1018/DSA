package com.TAP.Arrays;

public class BinarySearch {
    /**
     * @param arr  target
     * @return index of the target element if present else -1
     */
    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(target < arr[mid]) high  = mid-1;
            else low = mid+1;
        }
        return-1;
    }

}
