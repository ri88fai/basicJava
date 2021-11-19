package com.rifai;

public class ErrorStackOverflow {

    public static void main(String[] args) {
        System.out.println(" === Error Stack Overflow");
        loop(10_000);

    }

    static void loop(int value){
        if (value == 0){
            System.out.println("Finish");
        } else {
            System.out.println(" Loop " + value);
            loop(value-1);
        }
    }
}
