package com.partho;

import java.util.Scanner;

public class NthFiboNum {
    public static void main(String[] args) {

        // fibo series ==> 0, 1, 1, 2, 3, 5, 8, 13.......
        // 7th fibo number is 13 ==> then use count <= n
        // 7th fibo num is 8 ==> then use count < n

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count < n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
