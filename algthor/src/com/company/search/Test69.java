package com.company.search;

/**
 *
 */
public class Test69 {
    public static int mySqrt(int x) {
        int l = 1;
        int r = x;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid > x / mid) {
                r = mid - 1;
            } else if (mid < x / mid) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(mySqrt(x));
    }
}
