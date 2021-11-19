package com.rifai;

public class ExpressionStatementBlock {

    public static void main(String[] args) {

        System.out.println("=== Expression");
        float firstValue = 50.56f;
        System.out.println(firstValue);
        System.out.println(" ");

        System.out.println("=== Statement");
        double aValue = 2_000_000d; // this is assignment statement
        aValue++; // this is increment statement
        System.out.println(aValue); // this is method invocation statement
        // Date date = new Date(); this is object creation statement
        System.out.println(" ");

        System.out.println("=== Block");
        {
            int a = 100;
            System.out.println(a);
        }
        {
            var value1 = 700;
            var value2 = 300;
            var graduatedEnd = 700;

            var total = value1 + value2;

            if (total >= graduatedEnd){
                System.out.println("you win");
            } else {
                System.out.println("you lose");
            }

        }

    }
}
