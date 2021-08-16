package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("============ Training Nested if");
        int a,b,c;
        a = 1;
        b = 2;
        c = 3;

        System.out.println("----------- Start Program");
        if (a == 7){
            System.out.println("Statement 1");
        } else {
            if ( b == 20){
                System.out.println("Statement 4");
                } else {
                if (c == 3){
                    System.out.println("Statement 3");
                } else {
                    System.out.println("Statement 2");
                }
            }
        }
        System.out.println("----------- Finish Program");
        System.out.print("\n");

        System.out.println("----------- Start Program");
        int value1, value2, value3;

        value1 = 100;
        value2 = 200;
        value3 = 300;

        if (value1 == 100){
            if (value2 == 400){
                if (value3 == 300){
                    System.out.println("Statement 2");
                } else {
                    if (value3 == value1){
                        System.out.println("Statement 5");
                    } else {
                        System.out.println("Statement 3");
                    }
                }
            } else {
                System.out.println("Statement 1");
            }
        } else {
            System.out.println("Statement 4");
        }
        System.out.println("----------- Finish Program");

    }
}
