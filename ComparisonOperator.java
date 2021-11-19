package com.rifai;

public class ComparisonOperator {

    public static void main(String[] args) {
        System.out.println("==== Comparison Operator");
        int a,b,c,d;
        a = 10;
        b = 20;
        c = -10;
        d = -20;

        System.out.println("=== (<)");
        System.out.println(a < b);
        System.out.println(" ");

        System.out.println("=== (>)");
        System.out.println(a > b);
        System.out.println(" ");

        System.out.println("=== (<=) ");
        System.out.println(a <= a);
        System.out.println(" ");

        System.out.println("=== (>=) ");
        System.out.println(c >= c);
        System.out.println(" ");

        System.out.println("=== (==) ");
        System.out.println(c == d);
        System.out.println(" ");

        System.out.println("=== (!=) ");
        System.out.println(d != d);
        System.out.println(" ");

    }
}
