package com.rifai;

public class MethodReturnValue {

    public static void main(String[] args) {

        System.out.println("=== Method Return Value");
        System.out.println(sum(100, 100));
        System.out.println(multiple(5, 6));
        System.out.println(calc(5, "+", 10));
        System.out.println(calc(5, "-", 10));
        System.out.println(calc(5, "*", 10));
        System.out.println(calc(100, "/", 10));

    }

    // make method return value
    static int sum(int value1, int value2){
        int total = (value1 + value2);
        return total;
    }

    static int multiple(int value3, int value4){
        int totalMultiple = (value3 * value4);
        return totalMultiple;
    }

    static int calc(int value1, String operation, int value2){
        switch (operation){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }
}
