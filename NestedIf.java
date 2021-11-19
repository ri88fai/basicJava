package com.rifai;

public class NestedIf {

    public static void main(String[] args) {
        System.out.println("=== Nested if");
        int value1,value2,value3,value4;
        value1 = 100;
        value2 = 200;
        value3 = 300;
        value4 = 400;
        //value5 = 500;

        if (value1 == 100){
            if (value2 == 600){
                if (value3 == 300){
                    System.out.println("Statement 02");
                } else if (value4 == 400){
                    System.out.println("Statement 05");
                } else {
                    System.out.println("Statement 03");
                }
            } else {
                System.out.println("Statement 01");
            }
        } else {
            System.out.println("Statement 04");
        }


    }
}
