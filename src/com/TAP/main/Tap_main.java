package com.TAP.main;
import com.TAP.bitmanipulation.*;

import java.util.Scanner;

public class Tap_main {
    public static void printTriangle(int n) {
        // code here
        int len = n*2-1;//9
        for(int i=1; i<=len; i+=2){
            int spaces = len-i;//8
            for(int j=1; j<=len; j++){
                if(j<=spaces/2){
                    System.out.print('a');
                }else if(j>(spaces/2+i)){
                    System.out.print('b');
                }else{
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
//        System.out.print("Enter n value : ");
//        int n = scan.nextInt();
//        System.out.println("The output of the program is");
//        System.out.println(P_01_basicsOfRec.countDigits(n));

//        int[] arr = {1,2,3,4};
//        System.out.println(P_01_basicsOfRec.sumofArrayElements(arr,arr.length));
//        P_01_basicsOfRec.reverseArray(arr,0,arr.length-1);
//        for(int i:arr){
//            System.out.print(i+" ");
//
//        }
//        System.out.println(P_01_basicsOfRec.reverseString("arun",0));
//        P_02_Permutation.permutations_of("abc".toCharArray(),0);

//        P_03_bal_parantisis.balPara(new char[n*2],n,0,0,0);
//        int[] arr = {25,77,54,81,48,34};
//        int count = 0;
//        for(int i=0; i<arr.length; i++){
//            int sq = (int) Math.sqrt(arr[i]);
//            if(sq*sq == arr[i]){
//                count++;
//            }
//        }
//        System.out.println(count);
//        int p = 7;
//        int q = 10;
//        int count = 0 ;
//        int mask = p^q;
//        for(int i=0; i<32; i++){
//            if((mask&(1<<i)) != 0){
//                count++;
//            }
//        }
//        System.out.println(P_01_basicsOfRec.factorial(5));
//        scan.close();
//        printTriangle(5);
        int[] arr = {1,3,2,3,2,4,5,6,4,5,1};
        System.out.println(P_01_LonelyInteger.solution(arr));
    }


}
