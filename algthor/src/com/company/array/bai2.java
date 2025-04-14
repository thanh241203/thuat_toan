package com.company.array;

import java.util.ArrayList;

public class bai2 {
    static Integer getIntegerIndex(int a[], int value) {
        for (int i = 0; i < a.length; i++) {
           if(a[i]==value){
               return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int currentValue = 60;
        int b = getIntegerIndex(array, currentValue);
        System.out.println(b);
    }
}
