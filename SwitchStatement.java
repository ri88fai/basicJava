package com.rifai;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {


        System.out.println("===== Switch Statement");

        // library scanner
        Scanner inputUser;
        inputUser = new Scanner(System.in);

        String foodMenu;
        System.out.print("Please change your menu :\n" +
                "octopus, fish, shrimp = ");
        foodMenu = inputUser.next();

        switch (foodMenu){
            case "octopus":
                System.out.println("octopus is ready");
                break;
            case "shrimp":
                System.out.println("shrimp is ready");
                break;
            case "fish":
                System.out.println("fish is ready");
                break;
            default:
                System.out.println("sorry " + foodMenu + " is not ready");
        }

    }
}
