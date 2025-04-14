package com.company.binarySearch;

import java.util.Arrays;

public class main {
    static int binarySearch(int a[], int target) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == target) {
                return mid;
            }
            if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1, 3, 2, 7, 4, 8, 9};
        Arrays.sort(a);
        int result = binarySearch(a, 5);
        System.out.println(result);

    }
}
