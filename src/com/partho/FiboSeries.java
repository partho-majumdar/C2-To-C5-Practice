package com.partho;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = in.nextInt();

        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        int sum;

        for (int i = 2; i < n; i++) {
            int temp = second;
            sum = first + second;
            System.out.print(" " + sum);
            first = temp;
            second = sum;
        }
    }
}
