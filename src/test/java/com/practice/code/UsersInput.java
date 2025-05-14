package com.practice.code;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UsersInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println( "Please enter a name: ");
        int number = input.nextInt();

        System.out.println( "Please enter a string: ");
        String name = input.next();

        System.out.println( "Please enter a boolean: ");
        boolean bool = input.nextBoolean();


        System.out.println("Number is: " + number);
        System.out.println("Name is: " + name);
        System.out.println("bool is: " + bool);

    }
}
