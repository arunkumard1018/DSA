package com.TAP.main;
import com.TAP.Arrays.BasicArraysProgs;
import com.TAP.Arrays.BinarySearch;
import com.TAP.bitmanipulation.*;
import com.TAP.utill.*;
import java.util.Scanner;

public class Tap_main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
//        int[] arr = {1,3,4,5,9,11,15,16,17,19,22};
        int [] arr = {2,3,52,34,5,6,7,83,92,12,23,45,44};
        System.out.println("Input : ");
        Display.display(arr);
        System.out.println("Output :");
//        System.out.println(BinarySearch.search(arr,22));
//        System.out.println(BasicArraysProgs.spanOfanArray(arr));
        System.out.println(BasicArraysProgs.SecondLargestElement(arr));
    }


}
