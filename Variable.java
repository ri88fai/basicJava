package com.rifai;

public class Variable {

    public static void main(String[] args) {

        System.out.println("==== Variable");

        String yourName, address;
        int age;

        yourName = "Muhamad Rifai";
        age = 33;
        address = "Dusun Krajan II RT 014 RW 003 Desa Tanjungsari Timur" +
                " Kecamatan Cikaum Kabupaten Subang";

        System.out.println("Your name is = " + yourName);
        System.out.println("Age = " + age);
        System.out.println("Address = " + address);

        yourName = "Khotibul Umam";
        System.out.println("update your name = " + yourName);

        System.out.println("=== Using key var make variable on java ");
        var firstName = "Muhamad";
        var middleName = "Rifai";

        var StudentAbsentNumber = 15;

        System.out.println("First name = " + firstName);
        System.out.println("Middle name = " + middleName);
        System.out.println("Number Student = " + StudentAbsentNumber);

        System.out.println(" === Keyword final for variable/constanta");
        final String myHobby = "Table Tennis";
        System.out.println("My hobby is = " + myHobby);


    }
}
