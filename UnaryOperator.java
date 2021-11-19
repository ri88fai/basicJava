package com.rifai;

public class UnaryOperator {

    public static void main(String[] args) {
        System.out.println("==== Unary Operator");

        int a = 100;
        int b = -10;

        a++;
        System.out.println("Increment = " + a);
        b--;
        System.out.println("Decrement = " + b);
        System.out.println(" ");

        int c = 50;
        boolean d = true;

        ++c;
        System.out.println("Increment c = " + c);
        System.out.println("Boolean = " + !d);


    }
}
