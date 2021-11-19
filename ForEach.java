package com.rifai;

public class ForEach {

    public static void main(String[] args) {

        System.out.println("====== Code Not For Each");
        String[] operatingSystem = {
                "unix", "bsd", "mac", "windows", "linux"
        };

        for (int i = 0; i < operatingSystem.length; i++){
            System.out.println(operatingSystem[i]);
        }
        System.out.println(" ");

        System.out.println("==== For Each");
        String[] hobby = {
                "football", "table tennis", "golf",
                "basket", "travelling"
        };

        // make for each
        for (var myHobby : hobby){
            System.out.println(myHobby);
        }
        System.out.println(" ");

        int[] totalStudents = {
                14, 15, 16, 17
        };

        //make for each
        for (var total : totalStudents){
            System.out.println(total);
        }


    }
}
