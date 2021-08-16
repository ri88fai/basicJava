package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("======== Nested IF");
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        int a,b;
        System.out.print("Please enter value a = ");
        a = inputUser.nextInt();
        System.out.print("Please enter value b = ");
        b = inputUser.nextInt();

        if (a == 5){
            if (b == 11){
                System.out.println("This is statement (a == 5 and b == 11)");
            } else {
                System.out.println("This is statement (a == 5 and b not 11)");
            }
        } else {
            System.out.println("This is statement value a = wrong");
        }

    }
}
