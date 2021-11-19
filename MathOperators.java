package com.rifai;

public class MathOperators {

    public static void main(String[] args) {

        System.out.println("Math Operators");
        // + - * / %
        int a,b,total;
        a = 50;
        b = 2;

        System.out.println("==== Summation");
        total = (a+b);
        System.out.printf("Total sum %d + %d = %d \n",a,b,total);
        System.out.println(" ");

        System.out.println("==== Subtraction");
        total = (a-b);
        System.out.printf("Total reduction %d - %d = %d \n",a,b,total);
        System.out.println(" ");

        System.out.println("==== Multiplication");
        total = (a*b);
        System.out.printf("Total multiplication %d * %d = %d \n",a,b,total);
        System.out.println(" ");

        System.out.println("==== Distribution");
        total = (a/b);
        System.out.printf("Total division %d / %d = %d \n",a,b,total);
        System.out.println(" ");

        System.out.println("==== Modulus");
        total = (a%b);
        System.out.printf("Total modulus %d %% %d = %d \n",a,b,total);


    }
}
