package com.partho;

import java.util.Arrays;

public class ChangeArrayElement {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 6, 1, 9, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 88;
        num[1] = 22;
        num[2] = 44;
        num[3] = 66;
        num[4] = 11;
        num[5] = 99;
        num[6] = 55;
    }
}
