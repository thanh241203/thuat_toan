package com.company.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Remove element
 * Cho:
 * Một mảng số nguyên: nums
 * <p>
 * Một giá trị cần xoá khỏi mảng: val
 * <p>
 * 👉 Yêu cầu:
 * <p>
 * Xoá tất cả các phần tử có giá trị bằng val khỏi mảng nums — thực hiện trực tiếp trên mảng đó (in-place).
 * <p>
 * Thứ tự phần tử trong mảng có thể thay đổi.
 * <p>
 * Trả về k — số lượng phần tử còn lại sau khi xoá val (tức là số phần tử khác val).
 * <p>
 * ⚠️ Không cần quan tâm đến phần tử sau k.
 */
public class TestTwo {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        int a = removeElement(new int[]{2, 2, 3, 4}, 3);
        System.out.println(a);
    }
}
