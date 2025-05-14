package com.practice.code;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        /*

        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();


        if (a>b){
            System.out.println(a+ " is greater than"+b+".");
        }else if (a==b) {
            System.out.println(a+ " is equal to "+b+".");
        } else {
            System.out.println(a+ " is less than"+b+".");
        }
        */

        System.out.print(" Please enter a text1: ");
        String text1 = input.nextLine();

        System.out.print(" Please enter a text2: ");
        String text2 = input.nextLine();

        if(text1.equals(text2)){
            System.out.println("You have enter the same text");
        } else if (text1.equalsIgnoreCase(text2)) {
            System.out.println("You have entered the same text but case sensitive");
        }else {
            System.out.println("You have entered the different text");
        }
    }
}
