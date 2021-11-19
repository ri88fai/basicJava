package com.rifai;

public class TernaryOperator {

    public static void main(String[] args) {

        System.out.println("===== Ternary Operator");
        var mathValue = 75;
        var engValue = 70;

        // Ternary operator code
        String says = engValue >= 75 ? "Congrats your passed" : "Sorry your failed";
        System.out.println(says);

        String says1 = mathValue >= 70 ? "Congrats your passed" : "Sorry your failed";
        System.out.println(says1);

    }
}
