package com.partho;

public class ArmstrongRange {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int temp = n % 10;
            sum = sum + (temp * temp * temp);
            n = n / 10;
        }
        return sum == original;
    }
}
