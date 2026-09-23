package com.trial;

import java.util.Scanner;

public class Noborrows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int count = 0;
        int borrow = 0;

        while (num1 != 0 || num2 != 0) {

            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            if (digit1 - borrow < digit2) {
                count++;
                borrow = 1;
            } else {
                borrow = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }

        System.out.println(count);
    }
}
