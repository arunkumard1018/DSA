package com.TYF.recursion;
import com.TYF.recursion.P_01_SubsetSum;

import java.util.ArrayList;

/***
 * program to generate subset sum
 * program to print all subset of given array
 */

public class P_01_SubsetSum {

    public void subsetsum(int[] arr,int i,int sum){
        if(i==arr.length){
            System.out.print(sum+" ");

            return;
        }
        //don't pick element
        subsetsum(arr,i+1,sum+arr[i]);

        //pick Element
        subsetsum(arr,i+1,sum);

    }

    public void printsubsets(int[] arr,ArrayList ans,int i){
        if(i==arr.length){
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printsubsets(arr,ans,i+1);

        ans.remove(ans.size()-1);
        printsubsets(arr,ans,i+1);
    }
}
