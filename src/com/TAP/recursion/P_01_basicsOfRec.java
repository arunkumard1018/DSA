package com.TAP.recursion;

public class P_01_basicsOfRec {
    /**
     * @param n
     * @return factorial of n
     */
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    /**
     *
     * @param n
     * @return fibonacci of n
     */
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void printNnaturalNumber(int n){
        if(n==0){
            return;
        }
        printNnaturalNumber(n-1);
        System.out.print(n + " ");
    }
    /**
     * @param n
     * @return total number of digits
     */
    public static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return countDigits(n/10)+1;
    }

    /**
     * @param arr
     * @param len
     * @return sum off all the elements present in an array
     */
    public static int sumofArrayElements(int[] arr,int len){
        if(arr.length == 0)
            return 0;
        if(len == 1)
            return arr[0];
        return sumofArrayElements(arr,len-1) + arr[len-1];
    }

    public static void reverseArray(int[] arr,int low,int high){
        if (low>high){
            return;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high]= temp;
        reverseArray(arr,low+1,high-1);
    }

    public static String reverseString(String s,int i){
        if(i == s.length()){
            return "";
        }
        return reverseString(s,i+1)+s.charAt(i);
    }

    
}
