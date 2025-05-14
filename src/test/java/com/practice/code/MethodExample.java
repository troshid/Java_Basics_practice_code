package com.practice.code;

public class MethodExample {

    int a = 10;
    static int b = 20;

    public void mul(){
        int c = a * b;

    }

    public void sum(int a, int b){
        int sum = a+b;System.out.println("Summation: " +sum);
    }

    public static void sub(int a, int b){
        int sub = a - b;
        System.out.println("Subtraction: "+sub);
    }

    public static void main(String[] args){
        /*sub(a: 19, b: 2);
        MethodExample obj = new MethodExample();
        obj.sum(a: 20, b: 50);

         */

    }
}

