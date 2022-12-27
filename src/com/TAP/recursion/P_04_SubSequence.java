package com.TAP.recursion;

public class P_04_SubSequence {
    private static void subSeq(String s,String ans,int i){
        if(i == s.length()){
            System.out.print(ans+" ");
            return;
        }
        subSeq(s,ans+s.charAt(i),i+1);
        subSeq(s,ans,i+1);
    }
    public static void printSubSeq(String s){
        subSeq(s,"",0);
    }
}
