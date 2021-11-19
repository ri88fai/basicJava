package com.rifai;

import java.util.Scanner;

public class SwitchLambda {

    public static void main(String[] args) {

        System.out.println("===== Switch Lambda");
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        String inputItem;
        System.out.print("Please enter your choice item\n" +
                "motherboard, mouse, keyboard = ");
        inputItem = inputUser.next();

        switch (inputItem){
            case "motherboard", "mouse", "keyboard"
                    -> System.out.println("This item is available");
            default -> {
               System.out.println( inputItem + " is not ready");
            }
        }
        System.out.println(" ");

        System.out.println("==== Keyword yield");
        Scanner input;
        input = new Scanner(System.in);

        String valueA;
        System.out.print("Please enter your choice A,B,C or D = ");
        valueA = input.next();

        String says = switch (valueA){
            case "A":
                yield "your choice is right";
            case "B,C":
                yield "your choice is right";
            case "D":
                yield "your choice is right";
            default:
                yield "your choice is wrong";
        };
        System.out.println(says);

    }
}
