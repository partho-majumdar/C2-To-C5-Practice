package com.partho;

import java.util.Scanner;

public class LowerCaseUpperCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your character : ");
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
