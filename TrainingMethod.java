package com.rifai;

import java.util.Scanner;

public class TrainingMethod {
    public static void main(String[] args) {
        System.out.println("==== Rectangle");
        System.out.println(calcRec(50, 25));
        System.out.println(" ");

        System.out.println("==== Calc Program");
        System.out.println(calc(12.5f, "+", 43.45f));
        System.out.println(calc(12.5f, "-", 43.45f));
        System.out.println(calc(12.5f, "*", 43.45f));
        System.out.println(calc(12.5f, "/", 43.45f));
        System.out.println(calc(12.5f, "$", 43.45f));
        System.out.println(calc(12.5f, "^", 43.45f));
    }

    static int calcRec(int lengthRectangle, int widthRectangle){
        int total = lengthRectangle * widthRectangle;
        return total;
    }

    static float calc(float firstValue, String operator, float endValue){
        switch (operator){
            case "+":
                return firstValue + endValue;
            case "-":
                return firstValue - endValue;
            case "*":
                return firstValue * endValue;
            case "/":
                return firstValue / endValue;
            default:
                return 0;
        }
    }

}
