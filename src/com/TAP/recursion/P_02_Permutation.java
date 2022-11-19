package com.TAP.recursion;

public class P_02_Permutation {
    public static void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void permutations_of(char[] s,int fix){
        if(fix == s.length){
            System.out.print(new String(s)+" ");
            return;
        }

        for(int i=fix; i<s.length; i++){
            swap(s,i,fix);
            permutations_of(s,fix+1);
            swap(s,i,fix);
        }
    }
}
