package com.company.array;

import java.util.ArrayList;
import java.util.List;

public class bai3 {
    public static Integer getMax(int[]a){
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
    int[]arr={1,46,3,41};
    int c = getMax(arr);
        System.out.println(c);
    }
}
