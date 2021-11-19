package com.rifai;

public class IfElseifElse {

    public static void main(String[] args) {

        System.out.println("=== IF ELSE IF ELSE");
        int mathValue,IpaValue,engValue;
        int totalValue;

        mathValue = 80;
        IpaValue = 80;
        engValue = 80;

        totalValue = (mathValue+IpaValue+engValue);

        if (totalValue == 300){
            System.out.println("Congrats your passed predicat A+");
        } else if (totalValue > 300){
            System.out.println("your value is wrong");
        } else if (totalValue >= 270 && totalValue < 300){
            System.out.println("Congrats your passed predicat A");
        } else if (totalValue >= 240 && totalValue < 270){
            System.out.println("Congrats your passed predicat B");
        } else if (totalValue >= 210 && totalValue < 240){
            System.out.println("Congrats your passed predicat C");
        } else if (totalValue >= 180 && totalValue < 210){
            System.out.println("Congrats your passed predicat D");
        } else {
            System.out.println("Sorry your failed");
    }

    }
}
