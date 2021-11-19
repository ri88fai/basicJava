package com.rifai;

public class NumberDataTypeConversion {

    public static void main(String[] args) {

        System.out.println("======= Convert");
        /*
        Widening Casting
        Narrowing Casting
         */
        System.out.println("1.Widening Casting (automatic)");
        byte thisIsByte = 100;
        short thisIsShort = thisIsByte;

        System.out.println(" short = " + thisIsShort);
        int thisIsInt = thisIsByte;
        System.out.println(" int = " + thisIsByte);

        float studentsFuck;
        long goodStudents;
        goodStudents = 1_000_000L;
        studentsFuck = goodStudents;
        System.out.println("float = " + studentsFuck);
        System.out.println(" ");


        System.out.println("2. Narrowing Casting (manual)");
        int thisIsInt2 = 200;
        byte thisIsByte2 = (byte) thisIsInt2;
        System.out.println("byte = " + thisIsByte2);
        short thisIsShort2 = (short) thisIsInt2;
        System.out.println("short = " + thisIsShort2);


    }
}
