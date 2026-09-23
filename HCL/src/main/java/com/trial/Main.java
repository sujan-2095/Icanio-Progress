package com.trial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str =  input.nextLine();
        int len = str.length();
        int mid = len / 2;
        int lsum=0;
        int rsum=0;
        if(len%2!=0){
            int j=mid+1;
            for(int i=0; i<mid; i++){
                lsum+=(int)str.charAt(i);
                rsum+=(int)str.charAt(j);
                j++;
            }
            if(lsum==rsum){
                System.out.println("Balanced Number");
            }
            else{
                System.out.println("Not Balanced Number");
            }
        }
        else{
            System.out.println("Enter odd length number");
        }
    }
}