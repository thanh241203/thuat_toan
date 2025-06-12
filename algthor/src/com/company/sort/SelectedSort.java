package com.company.sort;

import java.util.Arrays;

public class SelectedSort {
    public static void main(String[] args) {
        int nums[] = {1, 4, 5, 2, 3};
        int size = nums.length;
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
