package com.javaproblems;

public class MatrixTranspose {

    static int[][] transpose(int a[][]) {
        int res[][] = new int[a[0].length][a.length];
        for(int k = 0; k < a.length; k++){
            for(int j = 0; j < a[0].length; j++){
                res[j][k] = a[k][j];
            }
        }
        return res;
    }
      
    static void print(int a[][]) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " "); 
            }
            System.out.println();
        }
    }
      
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        print(transpose(a));
    }
}
