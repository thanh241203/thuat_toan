package com.company.array.easy;

public class TestOne {
    /**
     * Cho một mảng số nguyên nums được sắp xếp theo thứ tự không giảm, hãy loại bỏ các phần tử trùng lặp ngay trong
     * mảng sao cho mỗi phần tử duy nhất chỉ xuất hiện một lần. Thứ tự tương đối của các phần tử phải được giữ nguyên.
     * Sau đó, trả về số lượng phần tử duy nhất trong nums.
     * Giả sử số lượng phần tử duy nhất trong nums là k, để được chấp nhận, bạn cần thực hiện các việc sau:
     * Thay đổi mảng nums sao cho k phần tử đầu tiên của nums chứa các phần tử duy nhất theo đúng thứ tự ban đầu trong nums.
     * Các phần tử còn lại trong nums không quan trọng, cũng như kích thước của nums.
     * Trả về k.
     */

    public int removeDuplicates(int[] nums) {
        // k số phần tử trùng lặp
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        TestOne testOne = new TestOne();
        testOne.removeDuplicates(new int[]{1, 1, 1, 2, 2});
    }
}
