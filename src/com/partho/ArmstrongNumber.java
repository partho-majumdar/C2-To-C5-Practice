package com.partho;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int in = input.nextInt();
        boolean result = isArmstrong(in);
        System.out.println(in + " " + "is Armstrong number? ==> " + result);
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        return sum == original;
    }
}
