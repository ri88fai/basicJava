package com.rifai;

public class Method {

    public static void main(String[] args) {
        sayHelloWorld();
        System.out.println(" ");

        sayYourName("Jhonny");
        sayYourName("lia");
        sayYourName("Andy");
    }

    // make method 1
    static void sayHelloWorld(){
        int a = 1;
        int b = 1;

        while (a <= 10){
            System.out.println("Hello World Java Programming " + a);
            a++;
        }
        System.out.println(" ");

        for (; b <= 5; b++){
            System.out.println("Method to " + b);
        }

    }

    // make method 2
    static void sayYourName(String firstName){
        System.out.println("Hello my name is " + firstName);
    }

}
