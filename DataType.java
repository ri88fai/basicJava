package com.rifai;

public class DataType {
    public static void main(String[] args) {
        System.out.println("===================== Data Type Java");
        System.out.println("----- Data Type Number");
        System.out.println("1.Integer Number"); // bilangan bulat
        /*
        byte
        short
        int
        long
         */
        byte thisIsByte = 100;
        short thisIsShort = 1_000;
        int thisIsInt = 10_000;
        long thisIsLong = 1_000_000L;

        System.out.println("byte = " + thisIsByte);
        System.out.println("short " + thisIsShort);
        System.out.println("int = " + thisIsInt);
        System.out.println("long = " + thisIsLong);
        System.out.println(" ");

        System.out.println("2.Floating Point Number"); //
        /*
        float
        double
         */
        float thisIsFloat = 24.5f;
        double thisIsDouble = 100.567d;

        System.out.println("float " + thisIsFloat);
        System.out.println("double " + thisIsDouble);
        System.out.println(" ");

        System.out.println("3.Literal Code");
        int decimalInt = 35;
        int hexInt = 0xA132B; // for hex add 0x
        int binInt = 0b01010101; // for bin add 0b

        System.out.println(" decimalInt = " + decimalInt);
        System.out.println(" hexInt = " + hexInt);
        System.out.println(" binInt = " + binInt);


    }

}
