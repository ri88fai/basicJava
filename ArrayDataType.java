package com.rifai;

public class ArrayDataType {

    public static void main(String[] args) {

        System.out.println("==== Data Type Array");

        String[]  yourName;
        yourName = new String[2];

        yourName[0] = "Muhamad";
        yourName[1] = "Rifai";

        System.out.println("My Name is = " + yourName[0]
                + " " + yourName[1]);
        System.out.println(" ");

        System.out.println("=== Update Name");
        yourName[0] = "Khotibul";
        yourName[1] = "Umam";
        System.out.println("My Name is = " + yourName[0]
                + " " + yourName[1]);
        System.out.println(" ");

        System.out.println("=== Code : Array Initializer");

        int[] numberNumber = new int[] {
                90, 56, 77, 83, 67, 123, 456
        };
        System.out.println("This is Array to = " + numberNumber[3]);
        System.out.println(numberNumber.length);
        System.out.println(" ");

        String[] nameName = {
                "Abdul", "Majid", "Saeful", "Khodijah"
        };
        System.out.println("This is Array to = " +nameName[0]);
        System.out.println("This is Array to = " +nameName[2]);
        System.out.println(" ");

        float[] floatingFloating = {
                45.5f, 56.55f, 78.45f
        };
        System.out.println("This is Array to = " + floatingFloating[0]);
        System.out.println(" ");

        System.out.println("===== Operation Array");
        long[] arrayLong = {
                1_000_000L, 2_000_000L, 1_000_000_000L
        };
        arrayLong[0] = 200;
        System.out.println("Change Array index 0 = " + arrayLong[0]);

        //length array starting with number one
        System.out.println("Length Array = " + (arrayLong.length));

        System.out.println(" ");
        String[] studentsC = {
                "Abi", "Baba", "Cepi", "Dany"
        };
        studentsC[0] = null;
        System.out.println("Array index 0 = " + studentsC[0]);
        System.out.println(" ");

        int[] myComputer = {
                1,2,3,4,5
        };
        myComputer[0] = 0;
        System.out.println("Array index 0 = " + myComputer[0]);


    }
}
