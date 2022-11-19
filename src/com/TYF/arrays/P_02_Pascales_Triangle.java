package com.TYF.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * to print the pascal's Triangle
 * input n = 5
 * output :
 *            1
 *          1   1
 *        1   2   1
 *      1  3    3   1
 */
public class P_02_Pascales_Triangle {
    public static List<List<Integer>> pasclesTriangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = null;
        for(int i=0; i<n; i++){
            List<Integer> lst = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(i==j || j==0){
                    lst.add(1);
                }else{
                    int val = prev.get(j-1)+prev.get(j);
                    lst.add(val);
                }
            }
            prev = lst;
            ans.add(prev);
        }
        return ans;
    }
}
