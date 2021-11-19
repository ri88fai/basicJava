package com.rifai;

import java.util.Scanner;

public class RecursiveMethod {

    public static void main(String[] args) {

        System.out.println("==== Factorial Loop");
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int yourValue;
        System.out.print("Please enter your factorial value = ");
        yourValue = factorialLoop(inputUser.nextInt());
        System.out.println("Result Factorial = " + yourValue);
        System.out.println(" ");

        System.out.println("==== Factorial Recursive");
        int yourValue1;
        System.out.print("Please enter your factorial value = ");
        yourValue1 = factorialRecursive(inputUser.nextInt());
        System.out.println("Result Factorial = " + yourValue1);
        System.out.println(" ");

        System.out.println("==== Stack over flow value > 10000");
        stackOverflow(10);
    }

    // method factorial loop increment
    static int factorialLoop(int value){
        int startFactorial = 1;

        for (int firstValue = 1; firstValue <= value; firstValue++){
            startFactorial *= firstValue;
        }
        return startFactorial;
    }

    // method factorial recursive
    static int factorialRecursive(int value1){
        if (value1 == 1){
            return 1;
        } else {
            return value1 * factorialRecursive(value1 - 1);
        }
    }

    // method recursive stack overflow
    static void stackOverflow(int value){
        if (value == 0){
            System.out.println("Finish");
        } else {
            System.out.println(" value to " + value);
            stackOverflow(value - 1);
        }
    }

}
