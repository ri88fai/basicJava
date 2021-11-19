package com.rifai;

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("=== For Loop");
        /*
        looping forever
        /for (;;){
            System.out.println("stuck");
        }
         */
        System.out.println("==== For loop using condition");
        var firstValue = 1;

        for(; firstValue <= 10 ;){
            System.out.println("Number of = " + firstValue);
            firstValue++;
        }
        System.out.println(" ");

        System.out.println("==== For loop using init statement");
        for (int i = 1; i <= 5; i++){
            System.out.println("Print Number of " + i);
        }


    }

}
