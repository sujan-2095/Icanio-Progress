package com.trial;
import java.util.Scanner;
public class palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int r=0;
        int temp=e;
        while(temp!=0){
            r=r*10+temp%10;
            temp=temp/10;
        }
        System.out.println((r==e)?"Palindrome":"Not Palindrome");
    }
}
