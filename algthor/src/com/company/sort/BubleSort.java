package com.company.sort;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int nums[] = {1, 4, 5, 2, 3};
        int size = nums.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
