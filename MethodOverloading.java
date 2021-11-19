package com.rifai;

public class MethodOverloading {

    public static void main(String[] args) {
        sayHello();
        sayHello("Windi");
        sayHello("Table Tennis", "football");
        System.out.println(" ");

        System.out.println(sayHello(5,5));
    }

    static void sayHello(){
        System.out.println("Hello my name is Muhamad Rifai");
    }

    static void sayHello(String firstName){
        System.out.println("Hello my name is " + firstName);
    }

    static void sayHello(String myHobby, String yourHobby){
        System.out.println("My hobby is " + myHobby + " and your hobby is " + yourHobby);
    }

    static int sayHello(int value1, int value2){
        int total;
        total = value1 * value2;
        return total;
    }
}

