package com.rifai;

public class Scope {

    public static void main(String[] args) {
        System.out.println("=== Scope");
        sayHello("Muhamad Rifai");
        sayHello(" ");
    }

    static void sayHello(String name){
        String sayProgramming = "Hello " + name;

        //  start scope block
        if (!name.isBlank()){
            String hi = "Hi.. " + name;
            System.out.println(hi);
        }
        //  finish scope block

        System.out.println(sayProgramming);
    }
}
