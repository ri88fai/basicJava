package com.rifai;

public class MethodParameter {

    public static void main(String[] args) {
        System.out.println("==== Method Parameter");
        yourName("Muhamad", "Rifai");
        yourName("Windi", "Permatasari");
        yourName("Steven", "Beckham");

    }

    static void yourName(String firstName, String lastName){
        System.out.println("My name is " + firstName + " " + lastName);

    }
}
