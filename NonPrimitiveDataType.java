package com.rifai;

public class NonPrimitiveDataType {

    public static void main(String[] args) {
        System.out.println("==== Non Primitive Data Type");
        Integer thisIsInteger = 100;
        Long thisIsLong = 1_000_000L;
        Byte thisIsByte = null;

        System.out.println("Data type non primitive = " + thisIsInteger);
        System.out.println("Data type non primitive = " + thisIsLong);
        System.out.println("Data type non primitive = " + thisIsByte);
        System.out.println(" ");

        System.out.println("==== Convert Data type primitive to non primitive");
        System.out.println("=== Convert part 1");
        int studentsA = 50;
        Integer studentsB = studentsA;
        System.out.println("Convert DT primitive to non primitive = " + studentsA);
        System.out.println(" ");

        System.out.println("=== Convert part 2");
        int thisIsNonObject = 100;
        Integer thisIsObject = thisIsNonObject;

        short thisIsShort = thisIsObject.shortValue();
        long thisIsLong2 = thisIsObject.longValue();
        byte thisIsByte3 = thisIsObject.byteValue();
        System.out.println("Convert part 2 = " + thisIsShort);
        System.out.println("Convert part 2 = " + thisIsLong2);
        System.out.println("Convert part 2 = " + thisIsByte3);

    }
}
