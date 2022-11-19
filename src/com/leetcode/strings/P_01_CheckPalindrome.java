package com.leetcode.strings;

import java.util.ArrayList;

public class P_01_CheckPalindrome {

    //brut force approach TC : O(n) space : O(n)
    public static boolean isPalindrome(String s){
        int count = 0;
        System.out.println("the Original String is : "+s);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<122)){
                count ++;
            }
        }
        if(count == 0) return  true;
        char[] chr = new char[count];
        int j = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
                chr[j++] = Character.toLowerCase(ch);
            }
        }
        System.out.println("the modified String is : "+new String(chr));
        int low = 0, heigh = count-1;
        while(low<heigh){
            if(chr[low] != chr[heigh]){
                return false;
            }else{
                low++;
                heigh--;
            }
        }
        return true;
    }

    /* Efficent approach without using Extra Space TC:O(n) */
    public static boolean isPalindromeEf(String s){
        boolean[] data = new boolean[26]; //assuming the charset was ascii
        int charcount = 0;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if((ch>=65 && ch<=90) || (ch>=97 && ch<122)){
                ch = Character.toLowerCase(ch);
                int val = ch-97;
                if(data[val]){
                    data[val] = false;
                }else{
                    data[val] = true;
                }
                charcount++;
            }
        }
        if(charcount==0 ||charcount==1){
            return true;
        }
//        if(charcount==1) return false;
        boolean isonleyoneodd = false;
        for(int i=0; i<data.length; i++){
            if(data[i]){
                if(isonleyoneodd){
                    return false;
                }else {
                    isonleyoneodd = true;
                }
            }
        }
        return  true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        s = "0P";
        System.out.println("is a palindrome "+ isPalindromeEf(s));
        ArrayList<Long> all = new ArrayList<Long>();
        System.out.println(all.toArray());

    }
}
