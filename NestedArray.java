package com.rifai;

public class NestedArray {

    public static void main(String[] args) {

        System.out.println("=== Nested Array");

        System.out.println("Nested Array String");
        String[][] members = {
                {"Muhamad", "Rifai"},
                {"Khotibul", "Umam", "bbc"},
                {"Computer"}
        };

        System.out.println("Array to = " + members[0][1]);
        System.out.println("Array to = " + members[1][2]);
        System.out.println("Array to = " + members[2][0]);
        System.out.println(" ");

        System.out.println("Nested Array integer");
        int[][] value = {
                {1,2,3,4,5},
                {11,22,33,44,55},
                {2,4,6,8,}
        };

        System.out.println("Array to = " + value[0][4]);
        System.out.println("Array to = " + value[1][2]);
        System.out.println("Array to = " + value[2][3]);


    }
}
