package com.TAP.recursion;

public class P_03_bal_parantisis {

    public static void balPara(char[] arr,int n,int open,int close,int i){
        if(i == arr.length){
            System.out.print(new String(arr) + ",");
            return;
        }
        if(open<n){
            arr[i] = '(';
            balPara(arr,n,open+1,close,i+1);
        }
        if(close<open){
            arr[i] = ')';
            balPara(arr,n,open,close+1,i+1);
        }
    }
}
