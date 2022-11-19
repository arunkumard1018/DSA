package com.TAP.utill;

import java.util.List;

public class Display {
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void display(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayList(List<Integer> lst){
        System.out.print("[ ");
        for(int i : lst){
            System.out.print(i+" ");
        }
        System.out.print("]\n");
    }

    public static void display(List<List<Integer>> lst){
        for(List<Integer> list : lst){
            displayList(list);
        }
    }
}
