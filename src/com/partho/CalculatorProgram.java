package com.partho;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter any operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two number : ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }

                if (op == '-') {
                    ans = n1 - n2;
                }

                if (op == '*') {
                    ans = n1 * n2;
                }

                if (op == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }

                if (op == '%') {
                    ans = n1 % n2;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}


/*

    Scanner input = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter any operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two number: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }

                if (op == '-') {
                    ans = num1 - num2;
                }

                if (op == '*') {
                    ans = num1 * num2;
                }

                if (op == '%') {
                    ans = num1 % num2;
                }

                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }

*/
