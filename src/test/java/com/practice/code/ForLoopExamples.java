package com.practice.code;

public class ForLoopExamples {
    public static void main(String[] args){
//        for(int i = 1; i<10; i++){
//            System.out.print( "i = " + i);
//        }


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        for (int number : numbers){
            System.out.println("Count: " +number);

        }
    }
}
