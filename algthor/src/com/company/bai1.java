package com.company;

import java.util.ArrayList;
import java.util.List;

public class bai1 {
    static List<Integer> getIntegers(int a[]) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < a.length; i+=2) {
            integers.add(a[i]);
        }
        return integers;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        List<Integer> integers = getIntegers(a);
        integers.forEach(System.out::println);
    }
}
