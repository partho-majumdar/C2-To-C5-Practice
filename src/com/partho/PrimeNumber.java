package com.partho;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number for check is it prime or not : ");
        int in = input.nextInt();
        boolean ans = isPrime(in);
        System.out.println(in + " " + "is Prime number? ==> " + ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}

