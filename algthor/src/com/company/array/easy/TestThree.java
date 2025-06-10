package com.company.array.easy;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order
 */
public class TestThree {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (target <= nums[i]) {
                nums[i] = target;
                return i;
            }
        }
        return nums.length ;
    }

    public static void main(String[] args) {

    }
}
