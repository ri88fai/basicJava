package com.rifai;

public class MethodVariableArgument {

    public static void main(String[] args) {

        System.out.println("==== Method Variable Argument");
        sayCongrats("Rifai", 80, 80, 90, 90, 100);
        sayCongrats("Fanny", 50, 50, 60, 90, 40);

    }

    static void sayCongrats(String name, int... values){
        int total = 0;
        for (int value : values){
            total += value;
        }
       int finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Congrats " + name + " your passed");
        } else {
            System.out.println("Sorry " + name + " your failed");
        }

    }
}
