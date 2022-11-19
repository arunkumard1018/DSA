package com.TYF.main;

import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int front = arr[0];
        int rare = 0;
        for(int i=1; i<n; i++){
            rare += arr[i];
        }
        for(int i=1; i<n-1; i++){
            if(front == rare - arr[i]){
                System.out.println(arr[i]);
                break;
            }else{
                front += arr[i];
                rare -= arr[i];
            }
        }
        System.out.println("No Equilibrium Element found");

    }

}
