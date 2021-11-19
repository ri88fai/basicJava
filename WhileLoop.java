package com.rifai;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        System.out.println("===== While Loop");

        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int firstValue, endValue;

        System.out.print("Please enter your first number = ");
        firstValue = inputUser.nextInt();
        System.out.print("Please enter your end number = ");
        endValue = inputUser.nextInt();

        while (firstValue <= endValue){
            System.out.println("Number = " + firstValue);
            firstValue++;
        }


    }
}
