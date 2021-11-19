package com.rifai;

public class AugmentedAssignments {

    public static void main(String[] args) {

        // += -= *= /= %=
        System.out.println("=== Augmented Assignments");

        int a,b,c,d,total;
        a = 56;
        b = 65;
        c = 44;
        d = 34;

        System.out.println("Total = " + (a+=10));
        System.out.println("Total = " + (b+=10));
        System.out.println(" ");

        System.out.println("Update value a = " + a);
        System.out.println("Update value b = " + b);
        System.out.println(" ");

        total = (a*b) + (c+d);
        System.out.println("Total = " + total);
        System.out.println("Update total = " + (total*=b));

    }
}
