package com.rifai;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        System.out.println("==== Break And Continue");
        System.out.println("1-Break");
        int start = 1;

        while (true){
            System.out.println("Number is = " + start);
            start++;
            if (start > 10){
                break;
            }
        }
        System.out.println(" ");

        System.out.println("2-Continue");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("odd numbers " + i);
        }
        System.out.println(" ");

        System.out.println("Simple Program show odd numbers and even numbers");
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int inputNumber;
        System.out.print("Please enter your number = ");
        inputNumber = inputUser.nextInt();

        if (inputNumber % 2 == 1){
            System.out.println(inputNumber + " is odd number");
        } else if (inputNumber % 2 == 0){
            System.out.println(inputNumber + " is even number");
        } else {
            System.out.println("you entered the wrong number");
        }

    }
}
