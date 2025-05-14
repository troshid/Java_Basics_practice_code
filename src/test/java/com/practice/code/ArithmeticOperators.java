package com.practice.code;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter the first number: ");
        int a = input.nextInt();
        System.out.print( "Enter the second number: ");
        int b = input.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int remainder = a % b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        System.out.println("The difference of " + a + " and " + b + " is " + difference);
        System.out.println("The product of " + a + " and " + b + " is " + product);
        System.out.println("The remainder of " + a + " and " + b + " is " + remainder);

    }
}
