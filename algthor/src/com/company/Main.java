package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //1 declaring array :type name[] || type [] name
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //2 multi-dimensional  array
        int[][] multi = {
                {1, 2, 3},
                {4, 5, 6},
                {12, 3, 4}
        };
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                System.out.println("Element at index "
                        + i + " : " + multi[i][j]);
            }
        }

        //3 common operations : sort , search , copy , fill(gán giá trị thành 0)
        int intArrayc[] = {1, 3, 2, 1, 4};
        Arrays.sort(intArrayc);
        Arrays.fill(intArrayc,0);
        for (int j = 0; j < intArrayc.length; j++) {
            System.out.println("Element at indexiiiiii "
                    + j + " : " + intArrayc[j]);
        }
    }
}
