package com.TYF.matrices;

public class P01_SetMatrixZeros {
    /* Approach 01 BrutForce*/
    public static void SolOne(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == 0){
                    fillMinusOne(arr,i,j);
                }
            }
        }
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }
    public static  void fillMinusOne(int[][] arr,int row,int col){
        for(int j=0; j<arr[0].length; j++){
            if(arr[row][j] != 0){
                arr[row][j] = -1;
            }
        }
        for(int i=0; i< arr.length; i++){
            if(arr[i][col] != 0){
                arr[i][col] = -1;
            }
        }
    }

    /* Solution Two */
    public static void fillZeros(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for (int i=0; i<row; i++){
            if(arr[i][0] == 0)
                firstColHasZero = true;
        }
        for(int j=0; j<col; j++){
            if(arr[0][j] == 0)
                firstRowHasZero = true;
        }
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for(int i=0; i<row; i++){
            if(arr[i][0] == 0)
                nullifyRow(arr,i);
        }
        for(int j=0; j<col; j++){
            if(arr[0][j] == 0)
                nullifyCol(arr,j);
        }
        if(firstColHasZero)
            nullifyCol(arr,0);
        if (firstRowHasZero)
            nullifyRow(arr,0);
    }

    public static void nullifyRow(int[][] arr,int i){
        for(int j=0; j<arr[0].length; j++)
            arr[i][j] = 0;
    }

    public static void nullifyCol(int[][] arr,int j){
        for (int i=0; i< arr.length; i++)
            arr[i][j] = 0;
    }

}
