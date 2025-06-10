package com.company.search;

public class Demo {
    public static void main(String[] args) {
        int nums[] = {5, 6, 7, 8, 9};
        int target = 9;
        int result = linearSearch(nums, target);
        System.out.println(result);
    }

    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // chỉ dùng khi đã sắp xếp
    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }
}
